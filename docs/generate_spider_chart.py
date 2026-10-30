"""Plot provisional user ratings for the observed class diagram workflow."""
from pathlib import Path
import numpy as np
import matplotlib
matplotlib.use('Agg')
import matplotlib.pyplot as plt

labels = ['Diagram Automation', 'Ease of Use', 'Layout Convenience']
# Provisional qualitative ratings, not benchmarks or measured accuracy.
ratings = {
    'Visual Paradigm': [4.5, 4.5, 4.0],
    'Enterprise Architect': [3.5, 3.0, 3.0],
    'StarUML': [2.5, 2.5, 2.5],
}
styles = [('#1676b8','o','-'),('#dd633c','s','--'),('#38975d','^',':')]
angles = np.linspace(0, 2*np.pi, len(labels), endpoint=False).tolist()
fig, ax = plt.subplots(figsize=(11, 9), subplot_kw={'polar': True})
fig.patch.set_facecolor('white')
ax.set_facecolor('#f7f9fc')
ax.set_theta_offset(np.pi/2)
ax.set_theta_direction(-1)
for (name, scores), (color, marker, line) in zip(ratings.items(), styles):
    ax.plot(angles+angles[:1], scores+scores[:1], color=color, marker=marker,
            linestyle=line, linewidth=2.6, markersize=7, label=name)
    ax.fill(angles+angles[:1], scores+scores[:1], color=color, alpha=.09)
ax.set_xticks(angles)
ax.set_xticklabels(labels, fontsize=13, weight='bold', color='#19364b')
ax.tick_params(axis='x', pad=20)
ax.set_ylim(0,5)
ax.set_yticks([1,2,3,4,5])
ax.set_yticklabels(['1','2','3','4','5'], fontsize=10, color='#657182')
ax.set_rlabel_position(35)
ax.grid(color='#cbd3dc',linestyle='--',alpha=.8)
ax.spines['polar'].set_color('#b5c1cc')
fig.suptitle('JAVA REVERSE ENGINEERING', fontsize=22, weight='bold', color='#12354c', y=.97)
fig.text(.5,.91,'Class Diagram Workflow Comparison',ha='center',fontsize=15,color='#526577')
fig.legend(loc='lower center',bbox_to_anchor=(.5,.085),ncol=3,frameon=False,fontsize=12)
fig.text(.5,.05,'Provisional user ratings on a five-point scale',ha='center',fontsize=11,color='#526577')
fig.text(.5,.022,'Based on the observed workflow. No benchmark or overall score.',ha='center',fontsize=10,color='#526577')
fig.subplots_adjust(top=.81,bottom=.22,left=.17,right=.83)
output=Path(__file__).resolve().with_name('spider_chart_evaluation.png')
fig.savefig(output,dpi=250,bbox_inches='tight',facecolor='white')
plt.close(fig)
print(output)
