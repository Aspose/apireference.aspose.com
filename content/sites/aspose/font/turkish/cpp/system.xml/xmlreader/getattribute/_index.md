---
title: "System::Xml::XmlReader::GetAttribute yöntemi"
linktitle: "GetAttribute"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlReader::GetAttribute yöntemi. Türetilmiş bir sınıfta geçersiz kılındığında, C++'da belirtilen dizine sahip öznitelik değerini alır."
type: docs
weight: 2800
url: /tr/cpp/system.xml/xmlreader/getattribute/
---
## XmlReader::GetAttribute(int32_t) method


Türetilmiş bir sınıfta geçersiz kılındığında, belirtilen dizinle öznitelik değerini alır.

```cpp
virtual String System::Xml::XmlReader::GetAttribute(int32_t i)=0
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| i | int32_t | Öznitelik indeksi. İndeks sıfır tabanlıdır. (İlk öznitelik indeks 0'dadır.) |

### ReturnValue

Belirtilen öznitelik değeri. Bu yöntem okuyucuyu hareket ettirmez.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::GetAttribute(String) method


Türetilmiş bir sınıfta geçersiz kılındığında, belirtilen [XmlReader::get_Name](../get_name/) değerine sahip öznitelik değerini alır.

```cpp
virtual String System::Xml::XmlReader::GetAttribute(String name)=0
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| ad | Dize | Özniteliğin nitelikli adı. |

### ReturnValue

Belirtilen öznitelik değeri. Öznitelik bulunamazsa veya değer [String::Empty](../../../system/string/empty/) ise, **nullptr** döndürülür.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::GetAttribute(String, String) method


Türetilmiş bir sınıfta geçersiz kılındığında, belirtilen [XmlReader::get_LocalName](../get_localname/) ve [XmlReader::get_NamespaceURI](../get_namespaceuri/) değerlerine sahip öznitelik değerini alır.

```cpp
virtual String System::Xml::XmlReader::GetAttribute(String name, String namespaceURI)=0
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| ad | Dize | Özelliğin yerel adı. |
| namespaceURI | Dize | Özelliğin ad alanı URI'si. |

### ReturnValue

Belirtilen niteliğin değeri. Nitelik bulunamazsa veya değer [String::Empty](../../../system/string/empty/) ise, **nullptr** döndürülür. Bu yöntem okuyucuyu hareket ettirmez.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
