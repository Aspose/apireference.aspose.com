---
title: "System::Xml::XmlReader::ReadElementContentAsObject yöntemi"
linktitle: "ReadElementContentAsObject"
second_title: "Aspose.Font için C++"
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

En uygun tipte bir kutulanmış nesne. [XmlReader::get_ValueType](../get_valuetype/) değeri uygun tipi belirler. İçerik bir liste tipi olarak tanımlanmışsa, bu yöntem uygun tipteki kutulanmış nesnelerden oluşan bir dizi döndürür.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::ReadElementContentAsObject(String, String) method


Belirtilen yerel ad ve ad alanı URI'sinin geçerli öğeyle eşleştiğini kontrol eder, ardından geçerli öğeyi okur ve içeriği bir [Object](../../../system/object/) olarak döndürür.

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadElementContentAsObject(String localName, String namespaceURI)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| localName | Dize | Öğenin yerel adı. |
| namespaceURI | Dize | Öğenin ad alanı URI'si. |

### ReturnValue

En uygun tipte bir kutulanmış nesne. [XmlReader::get_ValueType](../get_valuetype/) değeri uygun tipi belirler. İçerik bir liste tipi olarak tanımlanmışsa, bu yöntem uygun tipteki kutulanmış nesnelerden oluşan bir dizi döndürür.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
