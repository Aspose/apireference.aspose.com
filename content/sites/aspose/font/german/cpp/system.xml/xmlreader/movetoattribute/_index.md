---
title: "System::Xml::XmlReader::MoveToAttribute-Methode"
linktitle: "MoveToAttribute"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlReader::MoveToAttribute-Methode. Wenn sie in einer abgeleiteten Klasse überschrieben wird, wechselt sie zum Attribut mit dem angegebenen Index in C++."
type: docs
weight: 3200
url: /de/cpp/system.xml/xmlreader/movetoattribute/
---
## XmlReader::MoveToAttribute(int32_t) method


Wird in einer abgeleiteten Klasse überschrieben, wechselt es zum Attribut mit dem angegebenen Index.

```cpp
virtual void System::Xml::XmlReader::MoveToAttribute(int32_t i)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| i | int32_t | Der Index des Attributs. |

## Siehe auch

* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::MoveToAttribute(String) method


Wenn sie in einer abgeleiteten Klasse überschrieben wird, wechselt sie zum Attribut mit dem angegebenen [XmlReader::get_Name](../get_name/)-Wert.

```cpp
virtual bool System::Xml::XmlReader::MoveToAttribute(String name)=0
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | String | Der qualifizierte Name des Attributs. |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the reader's position does not change.

## Siehe auch

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::MoveToAttribute(String, String) method


Wenn sie in einer abgeleiteten Klasse überschrieben wird, wechselt sie zum Attribut mit den angegebenen [XmlReader::get_LocalName](../get_localname/)- und [XmlReader::get_NamespaceURI](../get_namespaceuri/)-Werten.

```cpp
virtual bool System::Xml::XmlReader::MoveToAttribute(String name, String ns)=0
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | String | Der lokale Name des Attributs. |
| ns | String | Der Namespace-URI des Attributs. |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the reader's position does not change.

## Siehe auch

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
