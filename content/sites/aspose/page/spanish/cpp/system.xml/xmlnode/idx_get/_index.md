---
title: "Método System::Xml::XmlNode::idx_get"
linktitle: "idx_get"
second_title: "Aspose.Page para C++"
description: "Método System::Xml::XmlNode::idx_get. Devuelve el primer elemento hijo con los valores especificados de XmlNode::get_LocalName y XmlNode::get_NamespaceURI en C++."
type: docs
weight: 3000
url: /es/cpp/system.xml/xmlnode/idx_get/
---
## XmlNode::idx_get(String, String) method


Devuelve el primer elemento hijo con los valores especificados de [XmlNode::get_LocalName](../get_localname/) y [XmlNode::get_NamespaceURI](../get_namespaceuri/).

```cpp
virtual SharedPtr<XmlElement> System::Xml::XmlNode::idx_get(String localname, String ns)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| nombre local | String | El nombre local del elemento. |
| ns | String | El URI del espacio de nombres del elemento. |

### ReturnValue

El primer [XmlElement](../../xmlelement/) con el **localname** y **ns** coincidentes. Devuelve **nullptr** si no hay coincidencia.

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNode::idx_get(String) method


Devuelve el primer elemento hijo con el [XmlNode::get_Name](../get_name/) especificado.

```cpp
virtual SharedPtr<XmlElement> System::Xml::XmlNode::idx_get(String name)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| name | String | El nombre calificado del elemento a recuperar. |

### ReturnValue

El primer [XmlElement](../../xmlelement/) que coincide con el nombre especificado. Devuelve **nullptr** si no hay coincidencia.

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
