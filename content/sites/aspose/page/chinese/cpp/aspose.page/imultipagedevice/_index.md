---
title: "Aspose::Page::IMultiPageDevice 类"
linktitle: "IMultiPageDevice"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::IMultiPageDevice 类。此接口包含用于在 C++ 中操作多页设备的方法。"
type: docs
weight: 800
url: /zh/cpp/aspose.page/imultipagedevice/
---
## IMultiPageDevice class


此接口包含用于操作多页设备的方法。

```cpp
class IMultiPageDevice : public virtual System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [ClosePage](./closepage/)() | 在页面渲染后进行设备的必要准备。 |
| virtual [get_CurrentPageNumber](./get_currentpagenumber/)() | 当前页码。 |
| virtual [InitPageNumbers](./initpagenumbers/)() | 初始化要输出的页数。 |
| virtual [OpenPage](./openpage/)(System::String) | 在页面渲染之前进行设备的必要准备。 |
| virtual [OpenPage](./openpage/)(float, float) | 在每个页面渲染之前进行设备的必要准备。 |
| virtual [UpdatePageParameters](./updatepageparameters/)(System::SharedPtr\<IMultiPageDevice\>) | 从其他多页设备更新页面参数。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)
