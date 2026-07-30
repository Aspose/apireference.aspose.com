---
title: "Aspose::Font::RenderingPath::IPathSegment 类"
linktitle: "IPathSegment"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::RenderingPath::IPathSegment 类。表示 C++ 中任意路径段的接口。"
type: docs
weight: 300
url: /zh/cpp/aspose.font.renderingpath/ipathsegment/
---
## IPathSegment class


表示任何路径段的接口。

```cpp
class IPathSegment : public System::ICloneable
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [CompareTo](./compareto/)(System::SharedPtr\<IPathSegment\>) |  |
| virtual [Copy](./copy/)() | 创建段对象的副本。 |
| virtual [Shift](./shift/)(double, double) | 执行 x 和 y 坐标的平移。 |
| virtual [Transform](./transform/)(System::SharedPtr\<TransformationMatrix\>) | 使用变换矩阵转换坐标。 |
## 另见

* Class [ICloneable](../../system/icloneable/)
* Namespace [Aspose::Font::RenderingPath](../)
* Library [Aspose.Font for C++](../../)
