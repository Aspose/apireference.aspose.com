---
title: "System::Xml::XmlNodeType enum"
linktitle: "XmlNodeType"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlNodeType enum. C++'ta düğüm türünü belirtir."
type: docs
weight: 6200
url: /tr/cpp/system.xml/xmlnodetype/
---
## XmlNodeType enum


Düğüm türünü belirtir.

```cpp
enum class XmlNodeType
```

### Değerler

| Ad | Değer | Açıklama |
| --- | --- | --- |
| None | 0 | Bu, bir **Read** yöntemi çağrılmamışsa [XmlReader](../xmlreader/) tarafından döndürülür. |
| Element | 1 | Bir öğe (örneğin, **<item>**). |
| Attribute | 2 | Bir öznitelik (örneğin, **id='123'**). |
| Text | 3 | Bir düğümün metin içeriği. Bir [XmlNodeType::Text](./) düğümünün alt düğümleri olamaz. [XmlNodeType::Attribute](./), [XmlNodeType::DocumentFragment](./), [XmlNodeType::Element](./) ve [XmlNodeType::EntityReference](./) düğümlerinin alt düğümü olarak görünebilir. |
| CDATA | 4 | Bir CDATA bölümü (örneğin, **my escaped text**). |
| EntityReference | 5 | Bir varlığa referans (örneğin, **&num;**). |
| Varlık | 6 | Bir varlık bildirimi (örneğin, **<!ENTITY...>**). |
| İşlemeTalimatı | 7 | Bir işleme talimatı (örneğin, **<?pi test?>**). |
| Yorum | 8 | Bir yorum (örneğin, ****). |
| Belge | 9 | Belge ağacının kökü olarak, tüm XML belgesine erişim sağlayan bir belge nesnesi. |
| BelgeTürü | 10 | Aşağıdaki etiketle gösterilen belge türü bildirimi (örneğin, **<!DOCTYPE...>**). |
| BelgeParçası | 11 | Bir belge parçası. |
| Notasyon | 12 | Belge türü bildirimindeki bir notasyon (örneğin, **<!NOTATION...>**). |
| Boşluk | 13 | Etiketler arasındaki boşluk. |
| ÖnemliBoşluk | 14 | Karışık içerik modelinde etiketler arasındaki boşluk veya **xml:space="preserve"** kapsamı içindeki boşluk. |
| BitişElemanı | 15 | Bir bitiş eleman etiketi (örneğin, ****). |
| EndEntity | 16 | Bir varlık değişiminin sonuna, [XmlReader](../xmlreader/) [XmlReader::ResolveEntity](../xmlreader/resolveentity/) çağrısı sonucunda ulaşıldığında döndürülür. |
| XmlDeclaration | 17 | XML bildirimi (örneğin, **<?xml version='1.0'?>**). [XmlNodeType::XmlDeclaration](./) düğümü belgenin ilk düğümü olmalıdır. Çocuk düğüm içeremez. [XmlNodeType::Document](./) düğümünün bir çocuğudur. Sürüm ve kodlama bilgisi sağlayan özniteliklere sahip olabilir. |

## Ayrıca Bakınız

* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
