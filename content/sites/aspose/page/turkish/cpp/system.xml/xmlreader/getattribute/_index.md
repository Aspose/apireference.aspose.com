---
title: "System::Xml::XmlReader::GetAttribute yöntemi"
linktitle: "GetAttribute"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlReader::GetAttribute yöntemi. Türetilmiş bir sınıfta geçersiz kılındığında, belirtilen indeksle özniteliğin değerini C++'ta alır."
type: docs
weight: 2800
url: /tr/cpp/system.xml/xmlreader/getattribute/
---
## XmlReader::GetAttribute(int32_t) method


Türetilmiş bir sınıfta geçersiz kılındığında, belirtilen indeksle öznitelik değerini alır.

```cpp
virtual String System::Xml::XmlReader::GetAttribute(int32_t i)=0
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| i | int32_t | Özniteliğin dizini. Dizin sıfır tabanlıdır. (İlk öznitelik dizini 0'dır.) |

### ReturnValue

Belirtilen özniteliğin değeri. Bu yöntem okuyucuyu hareket ettirmez.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::GetAttribute(String) method


Türetilmiş bir sınıfta geçersiz kılındığında, belirtilen [XmlReader::get_Name](../get_name/) değeriyle özniteliğin değerini alır.

```cpp
virtual String System::Xml::XmlReader::GetAttribute(String name)=0
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| ad | String | Özniteliğin nitelikli adı. |

### ReturnValue

Belirtilen özniteliğin değeri. Öznitelik bulunamazsa veya değer [String::Empty](../../../system/string/empty/) ise, **nullptr** döndürülür.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::GetAttribute(String, String) method


Türetilmiş bir sınıfta geçersiz kılındığında, belirtilen [XmlReader::get_LocalName](../get_localname/) ve [XmlReader::get_NamespaceURI](../get_namespaceuri/) değerleriyle özniteliğin değerini alır.

```cpp
virtual String System::Xml::XmlReader::GetAttribute(String name, String namespaceURI)=0
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| ad | String | Özniteliğin yerel adı. |
| namespaceURI | String | Özniteliğin ad alanı URI'si. |

### ReturnValue

Belirtilen özniteliğin değeri. Öznitelik bulunamazsa veya değer [String::Empty](../../../system/string/empty/) ise, **nullptr** döndürülür. Bu yöntem okuyucuyu hareket ettirmez.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
