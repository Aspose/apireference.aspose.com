---
title: "System::Drawing::TextureBrush sınıfı"
linktitle: "TextureBrush"
second_title: "Aspose.Page için C++"
description: "System::Drawing::TextureBrush sınıfı. Bir şeklin içini doldurmak için bir görüntü kullanan fırçayı temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak allocate edilmelidir. Yığın üzerinde veya operator new kullanarak bu tipin örneğini asla oluşturmayın; bu, çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve C++'ta fonksiyonlara argüman olarak geçirmek için bu işaretçiyi kullanın."
type: docs
weight: 2800
url: /tr/cpp/system.drawing/texturebrush/
---
## TextureBrush class


Bir şeklin içini doldurmak için bir görüntü kullanan fırçayı temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak allocate edilmelidir. Yığın üzerinde veya operator new kullanarak bu tipin örneğini asla oluşturmayın; bu, çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class TextureBrush : public System::Drawing::Brush
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Clone](./clone/)() override | Geçerli nesnenin bir kopyasını oluşturur. |
| [get_Image](./get_image/)() | Geçerli [TextureBrush](./) nesnesi tarafından kullanılan bir görüntüyü döndürür. |
| [get_Transform](./get_transform/)() | Geçerli nesne tarafından temsil edilen fırça için geometrik dönüşümleri belirten bir Matrix nesnesinin kopyasını döndürür. |
| [get_WrapMode](./get_wrapmode/)() | Geçerli nesne tarafından temsil edilen fırçanın döşenme şeklini belirten bir değeri döndürür. |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Drawing2D::Matrix\>\&, Drawing2D::MatrixOrder) | Geçerli nesnenin dönüşüm matrisini belirtilen matrisle çarpar. |
| [ResetTransform](./resettransform/)() | Geçerli nesnenin dönüşüm matrisini birim matris haline gelecek şekilde sıfırlar. |
| [RotateTransform](./rotatetransform/)(float, Drawing2D::MatrixOrder) | Yerel geometrik dönüşümü belirtilen açıyla ve belirtilen sırayla döndürür. |
| [ScaleTransform](./scaletransform/)(float, float, Drawing2D::MatrixOrder) | Yerel geometrik dönüşümü belirtilen faktörlerle ve belirtilen sırayla ölçeklendirir. |
| [set_Transform](./set_transform/)(const System::SharedPtr\<Drawing2D::Matrix\>\&) | Geçerli nesne tarafından temsil edilen fırça için geometrik dönüşümleri belirten bir Matrix nesnesi ayarlar. |
| [set_WrapMode](./set_wrapmode/)(Drawing2D::WrapMode) | Geçerli nesne tarafından temsil edilen fırçanın döşenme şeklini belirten bir değer ayarlar. |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, Drawing2D::WrapMode) | Belirtilen görüntüyü kullanan yeni bir [TextureBrush](./) sınıfı örneği oluşturur. |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, RectangleF, const SharedPtr\<Imaging::ImageAttributes\>\&) | Belirtilen görüntüyü kullanan yeni bir [TextureBrush](./) sınıfı örneği oluşturur. |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, Rectangle, const SharedPtr\<Imaging::ImageAttributes\>\&) | Belirtilen görüntüyü kullanan yeni bir [TextureBrush](./) sınıfı örneği oluşturur. |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, Drawing2D::WrapMode, RectangleF) | Belirtilen görüntüyü kullanan yeni bir [TextureBrush](./) sınıfı örneği oluşturur. |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, Drawing2D::WrapMode, Rectangle) | Belirtilen görüntüyü kullanan yeni bir [TextureBrush](./) sınıfı örneği oluşturur. |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | Yerel geometrik dönüşümü belirtilen boyutlarla ve belirtilen sırayla çevirir. |
| virtual [~TextureBrush](./~texturebrush/)() | Yıkıcı. |
## Ayrıca Bakınız

* Class [Brush](../brush/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
