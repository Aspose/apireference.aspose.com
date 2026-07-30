---
title: "System::Drawing::Imaging::ImageCodecInfo sınıfı"
linktitle: "ImageCodecInfo"
second_title: "Aspose.Font için C++"
description: "System::Drawing::Imaging::ImageCodecInfo sınıfı. Bir görüntü codec'i hakkında bilgi sağlar. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da new operatörüyle oluşturmaktan kaçının, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta işlevlere argüman olarak geçirmek için kullanın."
type: docs
weight: 1000
url: /tr/cpp/system.drawing.imaging/imagecodecinfo/
---
## ImageCodecInfo class


Bir görüntü codec'i hakkında bilgi sağlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da new operatörüyle oluşturmaktan kaçının, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi işlevlere argüman olarak geçirmek için kullanın.

```cpp
class ImageCodecInfo : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_FormatID](./get_formatid/)() const | Geçerli nesne tarafından temsil edilen codec'in formatıyla ilişkili bir GUID döndürür. |
| [get_MimeType](./get_mimetype/)() | Geçerli nesne tarafından temsil edilen codec'in Çok Amaçlı İnternet Posta Uzantıları (MIME) türünü döndürür. |
| static [GetImageDecoders](./getimagedecoders/)() | Desteklenen görüntü çözücülerini temsil eden [ImageCodecInfo](./) nesnelerinin bir dizisini döndürür. |
| static [GetImageEncoders](./getimageencoders/)() | Desteklenen görüntü kodlayıcılarını temsil eden [ImageCodecInfo](./) nesnelerinin bir dizisini döndürür. |
| [set_FormatID](./set_formatid/)(const Guid\&) | Geçerli nesne tarafından temsil edilen codec'in formatıyla ilişkili bir GUID ayarlar. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
