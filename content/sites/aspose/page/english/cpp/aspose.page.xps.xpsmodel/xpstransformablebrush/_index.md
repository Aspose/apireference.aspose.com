---
title: Aspose::Page::XPS::XpsModel::XpsTransformableBrush class
linktitle: XpsTransformableBrush
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::XpsModel::XpsTransformableBrush class. Class incapsulating common features of transformable brushes elements (all except SolidColorBrush) in C++.'
type: docs
weight: 4300
url: /cpp/aspose.page.xps.xpsmodel/xpstransformablebrush/
---
## XpsTransformableBrush class


Class incapsulating common features of transformable brushes elements (all except SolidColorBrush).

```cpp
class XpsTransformableBrush : public Aspose::Page::XPS::XpsModel::XpsBrush,
                              public Aspose::Page::XPS::XpsModel::ITransformableProperty
```

## Methods

| Method | Description |
| --- | --- |
| [get_Transform](./get_transform/)() override | Returns/sets the matrix transformation applied to the coordinate space of the brush. The Transform property is concatenated with the current effective render transform to yield an effective render transform local to the brush. The viewport for the brush is transformed using the local effective render transform. |
| [set_Transform](./set_transform/)(System::SharedPtr\<XpsMatrix\>) override | Returns/sets the matrix transformation applied to the coordinate space of the brush. The Transform property is concatenated with the current effective render transform to yield an effective render transform local to the brush. The viewport for the brush is transformed using the local effective render transform. |
## See Also

* Class [XpsBrush](../xpsbrush/)
* Class [ITransformableProperty](../itransformableproperty/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
