"""Render the observed comparison without inventing radar scores."""
from pathlib import Path
import matplotlib
matplotlib.use('Agg')
import matplotlib.pyplot as plt
from textwrap import fill

columns = ['Tiêu chí', 'Visual Paradigm', 'Enterprise Architect', 'StarUML + Java']
rows = [
 ['Sơ đồ theo package', 'Chọn package rồi tạo Class Diagram', 'Tự tạo khi import nếu bật tùy chọn', 'Có Package Overview và Type Hierarchy'],
 ['Gom sơ đồ tổng quan', 'Thuận tiện trong lần thử; ít kéo từng class', 'Quy trình đang thử cần kéo class và thêm phần tử liên quan', 'Cần nhiều thao tác gom class và chỉnh bố cục'],
 ['Quan hệ lớp', 'Ảnh có association và kế thừa', 'Ảnh có association và kế thừa', 'Ảnh có quan hệ entity; có Use Association'],
 ['Dễ sử dụng trong tác vụ', 'Người thực nghiệm đánh giá thuận tiện nhất', 'Phải tìm đúng class; đã kéo nhầm diagram và làm lại', 'Kéo thả khá tốn công trong lần thử'],
 ['Round-trip và hiệu năng', 'Chưa đủ minh chứng để chấm điểm', 'Chưa đủ minh chứng để chấm điểm', 'Chưa đủ minh chứng để chấm điểm'],
]
fig, ax = plt.subplots(figsize=(16, 8.6))
fig.patch.set_facecolor('white')
ax.axis('off')
data = [[fill(c, 32 if j else 22) for j,c in enumerate(row)] for row in rows]
t = ax.table(cellText=data, colLabels=columns, cellLoc='left', colLoc='left',
             colWidths=[.18,.275,.275,.27], bbox=[0,.12,1,.77])
t.auto_set_font_size(False)
t.set_fontsize(12)
for (r,c), cell in t.get_celld().items():
 cell.set_edgecolor('white'); cell.PAD=.07
 if r == 0:
  cell.set_facecolor('#083451');cell.set_text_props(color='white',weight='bold',fontsize=13)
 else:
  cell.set_facecolor('#e7f3ed' if c==1 else ('#f0f3f6' if r%2 else '#ffffff'))
  if c==0: cell.set_text_props(weight='bold')
fig.suptitle('SO SÁNH THỰC NGHIỆM: JAVA → CLASS DIAGRAM',x=.5,y=.97,fontsize=22,weight='bold',color='#083451')
ax.text(0, .95, 'Cùng mã mẫu • Ghi nhận thao tác và kết quả • Không quy đổi thành điểm số chưa kiểm chứng',
        transform=ax.transAxes,fontsize=13,color='#45556a')
ax.text(0,.045,'Lựa chọn của nhóm: Visual Paradigm — thuận tiện về tạo sơ đồ và dễ sử dụng trong tác vụ đã thử.',
        transform=ax.transAxes,fontsize=14,weight='bold',color='#176448')
ax.text(0,.0,'Phạm vi: Class Diagram. Không tính ERD; chưa xếp hạng hiệu năng hoặc khả năng round-trip.',
        transform=ax.transAxes,fontsize=11,color='#45556a')
fig.subplots_adjust(left=.035,right=.965,top=.90,bottom=.05)
output = Path(__file__).resolve().with_name('tool_comparison_table.png')
fig.savefig(output,dpi=220,bbox_inches='tight',facecolor='white')
plt.close(fig)
print(output)
