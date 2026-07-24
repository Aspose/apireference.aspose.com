---
title: "System::Xml::XmlReader::ReadElementContentAsObject yöntemi"
linktitle: "ReadElementContentAsObject"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlReader::ReadElementContentAsObject yöntemi. Geçerli öğeyi okur ve içeriği C++'ta bir Object olarak döndürür."
type: docs
weight: 6200
url: /tr/cpp/system.xml/xmlreader/readelementcontentasobject/
---
## XmlReader::ReadElementContentAsObject() method


Geçerli öğeyi okur ve içeriği bir [Object](../../../system/object/) olarak döndürür.

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadElementContentAsObject()
```


### ReturnValue

En uygun tipte kutulanmış bir nesne. [XmlReader::get_ValueType](../get_valuetype/) değeri uygun tipi belirler. İçerik bir liste tipi olarak tanımlıysa, bu yöntem uygun tipte kutulanmış nesnelerden oluşan bir dizi döndürür.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::ReadElementContentAsObject(String, String) method


Belirtilen yerel ad ve ad alanı URI'sinin geçerli öğe ile eşleştiğini kontrol eder, ardından geçerli öğeyi okur ve içeriği bir [Object](../../../system/object/) olarak döndürür.

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadElementContentAsObject(String localName, String namespaceURI)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| localName | String | Öğenin yerel adı. |
| namespaceURI | String | Öğenin ad alanı URI'si. |

### ReturnValue

En uygun tipte kutulanmış bir nesne. [XmlReader::get_ValueType](../get_valuetype/) değeri uygun tipi belirler. İçerik bir liste tipi olarak tanımlıysa, bu yöntem uygun tipte kutulanmış nesnelerden oluşan bir dizi döndürür.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
