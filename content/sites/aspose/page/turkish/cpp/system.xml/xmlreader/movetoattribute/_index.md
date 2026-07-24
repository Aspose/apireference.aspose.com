---
title: "System::Xml::XmlReader::MoveToAttribute yöntemi"
linktitle: "MoveToAttribute"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlReader::MoveToAttribute yöntemi. Türetilmiş bir sınıfta geçersiz kılındığında, C++'ta belirtilen dizine sahip özniteliğe geçer."
type: docs
weight: 3200
url: /tr/cpp/system.xml/xmlreader/movetoattribute/
---
## XmlReader::MoveToAttribute(int32_t) method


Türetilmiş bir sınıfta geçersiz kılındığında, belirtilen indeksle özniteliğe geçer.

```cpp
virtual void System::Xml::XmlReader::MoveToAttribute(int32_t i)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| i | int32_t | Özniteliğin indeksi. |

## Ayrıca Bakınız

* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::MoveToAttribute(String) method


Türetilmiş bir sınıfta geçersiz kılındığında, belirtilen [XmlReader::get_Name](../get_name/) değerine sahip özniteliğe geçer.

```cpp
virtual bool System::Xml::XmlReader::MoveToAttribute(String name)=0
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| ad | String | Özniteliğin nitelikli adı. |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the reader's position does not change.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::MoveToAttribute(String, String) method


Türetilmiş bir sınıfta geçersiz kılındığında, belirtilen [XmlReader::get_LocalName](../get_localname/) ve [XmlReader::get_NamespaceURI](../get_namespaceuri/) değerlerine sahip özniteliğe geçer.

```cpp
virtual bool System::Xml::XmlReader::MoveToAttribute(String name, String ns)=0
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| ad | String | Özniteliğin yerel adı. |
| ns | String | Özniteliğin ad alanı URI'si. |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the reader's position does not change.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
