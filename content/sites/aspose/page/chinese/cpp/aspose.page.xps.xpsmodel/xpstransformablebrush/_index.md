---
title: "Aspose::Page::XPS::XpsModel::XpsTransformableBrush 类"
linktitle: "XpsTransformableBrush"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsModel::XpsTransformableBrush 类。类封装了 C++ 中可变换画刷元素的通用特性（除 SolidColorBrush 之外的所有）。"
type: docs
weight: 4300
url: /zh/cpp/aspose.page.xps.xpsmodel/xpstransformablebrush/
---
## XpsTransformableBrush class


封装可变换画刷元素（除 SolidColorBrush 之外的所有）公共特性的类。

```cpp
class XpsTransformableBrush : public Aspose::Page::XPS::XpsModel::XpsBrush,
                              public Aspose::Page::XPS::XpsModel::ITransformableProperty
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Transform](./get_transform/)() override | 返回/设置应用于画刷坐标空间的矩阵变换。Transform 属性与当前有效渲染变换连接，以产生相对于画刷的有效渲染变换。画刷的视口使用本地有效渲染变换进行变换。 |
| [set_Transform](./set_transform/)(System::SharedPtr\<XpsMatrix\>) override | 返回/设置应用于画刷坐标空间的矩阵变换。Transform 属性与当前有效渲染变换连接，以产生相对于画刷的有效渲染变换。画刷的视口使用本地有效渲染变换进行变换。 |
## 另见

* Class [XpsBrush](../xpsbrush/)
* Class [ITransformableProperty](../itransformableproperty/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
