---
title: "System::Xml::XmlReader::MoveToAttribute metodu"
linktitle: "MoveToAttribute"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlReader::MoveToAttribute metodu. Türetilmiş bir sınıfta geçersiz kılındığında, C++'ta belirtilen dizine sahip özniteliğe geçer."
type: docs
weight: 3200
url: /tr/cpp/system.xml/xmlreader/movetoattribute/
---
## XmlReader::MoveToAttribute(int32_t) method


Türetilmiş bir sınıfta geçersiz kılındığında, belirtilen indeksdeki özelliğe geçer.

```cpp
virtual void System::Xml::XmlReader::MoveToAttribute(int32_t i)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| i | int32_t | Özniteliğin indeksi. |

## Ayrıca Bakınız

* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::MoveToAttribute(String) method


Türetilmiş bir sınıfta geçersiz kılındığında, belirtilen [XmlReader::get_Name](../get_name/) değerine sahip özniteliğe geçer.

```cpp
virtual bool System::Xml::XmlReader::MoveToAttribute(String name)=0
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| ad | Dize | Özniteliğin nitelikli adı. |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the reader's position does not change.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::MoveToAttribute(String, String) method


Türetilmiş bir sınıfta geçersiz kılındığında, belirtilen [XmlReader::get_LocalName](../get_localname/) ve [XmlReader::get_NamespaceURI](../get_namespaceuri/) değerlerine sahip özniteliğe geçer.

```cpp
virtual bool System::Xml::XmlReader::MoveToAttribute(String name, String ns)=0
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| ad | Dize | Özelliğin yerel adı. |
| ns | Dize | Özelliğin ad alanı URI'si. |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the reader's position does not change.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
