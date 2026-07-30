---
title: "System::Xml::Schema::XmlSchema::Compile yöntemi"
linktitle: "Compile"
second_title: "Aspose.Font için C++"
description: "System::Xml::Schema::XmlSchema::Compile yöntemi. XML Şema Nesne Modeli (SOM)'yi doğrulama için şema bilgisine derler. Programatik olarak oluşturulan SOM'un sözdizimsel ve anlamsal yapısını kontrol etmek için kullanılır. Anlamsal doğrulama denetimi derleme sırasında C++'da gerçekleştirilir."
type: docs
weight: 200
url: /tr/cpp/system.xml.schema/xmlschema/compile/
---
## XmlSchema::Compile(ValidationEventHandler) method


XML [Schema](../../)[Object](../../../system/object/) Modeli (SOM)'yi doğrulama için şema bilgisine derler. Programatik olarak oluşturulan SOM'un sözdizimsel ve anlamsal yapısını kontrol etmek için kullanılır. Anlamsal doğrulama denetimi derleme sırasında gerçekleştirilir.

```cpp
void System::Xml::Schema::XmlSchema::Compile(ValidationEventHandler validationEventHandler)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| validationEventHandler | ValidationEventHandler | XML [Schema](../../) doğrulama hataları hakkında bilgi alan doğrulama olay işleyicisi. |

## Ayrıca Bakınız

* Typedef [ValidationEventHandler](../../validationeventhandler/)
* Class [XmlSchema](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchema::Compile(ValidationEventHandler, const SharedPtr\<XmlResolver\>\&) method


XML [Schema](../../)[Object](../../../system/object/) Modeli (SOM)'yi doğrulama için şema bilgisine derler. Programatik olarak oluşturulan SOM'un sözdizimsel ve anlamsal yapısını kontrol etmek için kullanılır. Anlamsal doğrulama denetimi derleme sırasında gerçekleştirilir.

```cpp
void System::Xml::Schema::XmlSchema::Compile(ValidationEventHandler validationEventHandler, const SharedPtr<XmlResolver> &resolver)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| validationEventHandler | ValidationEventHandler | XML [Schema](../../) doğrulama hataları hakkında bilgi alan doğrulama olay işleyicisi. |
| resolver | const SharedPtr\<XmlResolver\>\& | **include** ve **import** öğelerinde başvurulan ad alanlarını çözmek için kullanılan [XmlResolver](../../../system.xml/xmlresolver/). |

## Ayrıca Bakınız

* Typedef [ValidationEventHandler](../../validationeventhandler/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XmlSchema](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
