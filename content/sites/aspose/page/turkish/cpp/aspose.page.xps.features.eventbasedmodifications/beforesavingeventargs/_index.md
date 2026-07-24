---
title: "Aspose::Page::XPS::Features::EventBasedModifications::BeforeSavingEventArgs class"
linktitle: "BeforeSavingEventArgs"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::BeforeSavingEventArgs sınıfı. C++'ta çeşitli kaydetmeden önceki olayların argümanları için temel sınıfı tanımlar."
type: docs
weight: 200
url: /tr/cpp/aspose.page.xps.features.eventbasedmodifications/beforesavingeventargs/
---
## BeforeSavingEventArgs class


Çeşitli kaydetmeden önceki olayların argümanları için temel sınıfı tanımlar.

```cpp
template<typename T>class BeforeSavingEventArgs : public System::Object
```


| Parameter | Açıklama |
| --- | --- |
| T | Değiştirme API türü. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_AbsolutePageNumber](./get_absolutepagenumber/)() const | [XPS](../../aspose.page.xps/) paketindeki tüm belgeler arasında geçerli mutlak sayfa numarası. |
| [get_DocumentNumber](./get_documentnumber/)() const | [XPS](../../aspose.page.xps/) paketindeki geçerli belge numarası. |
| [get_ElementAPI](./get_elementapi/)() const | Kaydedilmek üzere olan öğenin değiştirme API'sini alır. |
| [get_OutputPageNumber](./get_outputpagenumber/)() const | Geçerli çıktı numarası. **PageNumbers** kaydetme seçeneği belirtilmişse **AbsolutePageNumber**'dan farklıdır. |
| [get_RelativePageNumber](./get_relativepagenumber/)() const | [XPS](../../aspose.page.xps/) paketindeki geçerli belgeye göre geçerli sayfa numarası. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | n'inci şablon argümanını zayıf bir işaretçi olarak ayarla (paylaşılan yerine). Kapsayıcılardaki işaretçilerin zayıf moda geçişine izin verir. |

## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../)
* Library [Aspose.Page for C++](../../)
