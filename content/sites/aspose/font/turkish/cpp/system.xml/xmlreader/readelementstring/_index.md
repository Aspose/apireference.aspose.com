---
title: "System::Xml::XmlReader::ReadElementString metodu"
linktitle: "ReadElementString"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlReader::ReadElementString metodu. Yalnızca metin içeren bir öğeyi okur. Ancak, C++'ta bu işlemi daha basit bir şekilde ele almasını sağladığı için XmlReader::ReadElementContentAsString metodunun kullanılması önerilir."
type: docs
weight: 6400
url: /tr/cpp/system.xml/xmlreader/readelementstring/
---
## XmlReader::ReadElementString() method


Yalnızca metin içeren bir öğeyi okur. Ancak, bunun yerine [XmlReader::ReadElementContentAsString](../readelementcontentasstring/) yöntemini kullanmanız önerilir, çünkü bu işlem için daha doğrudan bir yol sağlar.

```cpp
virtual String System::Xml::XmlReader::ReadElementString()
```


### ReturnValue

Okunan öğenin içinde bulunan metin. Öğenin boş olması durumunda boş bir dize.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::ReadElementString(String, String) method


Yalnızca metin içeren bir öğeyi okumadan önce bulunan öğenin [XmlReader::get_LocalName](../get_localname/) ve [XmlReader::get_NamespaceURI](../get_namespaceuri/) değerlerinin verilen dizelerle eşleştiğini kontrol eder. Ancak, bunun yerine [XmlReader::ReadElementContentAsString](../readelementcontentasstring/) yöntemini kullanmanız önerilir, çünkü bu işlem için daha doğrudan bir yol sağlar.

```cpp
virtual String System::Xml::XmlReader::ReadElementString(String localname, String ns)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| yerelAd | Dize | Kontrol edilecek yerel ad. |
| ns | Dize | Kontrol edilecek ad alanı URI'si. |

### ReturnValue

Okunan öğenin içinde bulunan metin. Öğenin boş olması durumunda boş bir dize.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::ReadElementString(String) method


Yalnızca metin içeren bir öğeyi okumadan önce bulunan öğenin [XmlReader::get_Name](../get_name/) değerinin verilen dizeyle eşleştiğini kontrol eder. Ancak, bunun yerine [XmlReader::ReadElementContentAsString](../readelementcontentasstring/) yöntemini kullanmanız önerilir, çünkü bu işlem için daha doğrudan bir yol sağlar.

```cpp
virtual String System::Xml::XmlReader::ReadElementString(String name)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| ad | Dize | Kontrol edilecek ad. |

### ReturnValue

Okunan öğenin içinde bulunan metin. Öğenin boş olması durumunda boş bir dize.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
