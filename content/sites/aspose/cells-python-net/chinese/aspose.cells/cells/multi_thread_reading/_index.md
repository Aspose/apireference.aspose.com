---
title: multi_thread_reading属性
second_title: Aspose.Cells for Python via .NET API 参考文献
description:
type: docs
weight: 1220
url: /zh/aspose.cells/cells/multi_thread_reading/
is_root: false
---
## multi_thread_reading属性

获取或设置单元格数据模型是否应支持多线程读取。
此属性的默认值为 false。

### 注意事项

如果有多个线程同时读取此集合中的 Row/Cell 对象，
该属性应该设置为true，否则可能会产生意外的结果。
支持多线程读取可能会降低访问此集合中的 Row/Cell 对象的性能。
请注意，某些功能不支持多线程读取，
例如格式化值（通过 [`Cell.string_value`](/cells/python-net/zh/aspose.cells/cell#string_value)、[`Cell.display_string_value`](/cells/python-net/zh/aspose.cells/cell#display_string_value) 等）。
因此，即使将此属性设置为 true，这些 API 仍可能为多线程读取提供意外的结果。
### 定义：
```python
@property
def multi_thread_reading(self):
    ...
@multi_thread_reading.setter
def multi_thread_reading(self, value):
    ...
```

### 也可以看看
* 模块[`aspose.cells`](../../)
* 类 [`Cells`](/cells/python-net/zh/aspose.cells/cells)
