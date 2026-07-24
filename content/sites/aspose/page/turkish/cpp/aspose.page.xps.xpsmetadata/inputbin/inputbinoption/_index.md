---
title: "Aspose::Page::XPS::XpsMetadata::InputBin::InputBinOption class"
linktitle: "InputBinOption"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::XPS::XpsMetadata::InputBin::InputBinOption sınıfı. C++'da JobInputBin, DocumentInputBin ve PageInputBin özellik seçeneklerini tanımlar."
type: docs
weight: 700
url: /tr/cpp/aspose.page.xps.xpsmetadata/inputbin/inputbinoption/
---
## InputBinOption class


Bu, [JobInputBin](../../jobinputbin/), [DocumentInputBin](../../documentinputbin/) ve [PageInputBin](../../pageinputbin/) özellik seçeneklerini tanımlar.

```cpp
class InputBinOption : public Aspose::Page::XPS::XpsMetadata::Option,
                       public Aspose::Page::XPS::XpsMetadata::InputBin::IInputBinItem
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinOptionItem\>\>\&) | Seçeneğe [IInputBinOptionItem](../iinputbinoptionitem/) örneklerinden bir dizi ekler. |
| [Clone](./clone/)() | Bu seçenek örneğini klonlar. |
| [InputBinOption](./inputbinoption/)(System::String, const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinOptionItem\>\>\&) | Yeni bir örnek oluşturur. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [AutoSelect](./autoselect/) | Cihaz, yapılandırmaya göre en iyi seçeneği otomatik olarak seçecektir. |
| static [AutoSheetFeeder](./autosheetfeeder/) | Mürekkep püskürtmeli yazıcılar için cihaz giriş tepsisi. |
| static [Cassette](./cassette/) | Besleme kutusunun bir kaset olduğunu belirtir. |
| static [Manual](./manual/) | Varsayılan manuel besleme kutusunu belirtir. |
| static [Tractor](./tractor/) | Besleme kutusunun bir traktör olduğunu belirtir. |
## Ayrıca Bakınız

* Class [Option](../../option/)
* Class [IInputBinItem](../iinputbinitem/)
* Class [InputBin](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
