---
title: "Método System::Xml::XmlDocument::CreateNode"
linktitle: "CreateNode"
second_title: "Aspose.Page para C++"
description: "Método System::Xml::XmlDocument::CreateNode. Crea un XmlNode con el tipo de nodo especificado, XmlDocument::get_Name y XmlNode::get_NamespaceURI en C++."
type: docs
weight: 1100
url: /es/cpp/system.xml/xmldocument/createnode/
---
## XmlDocument::CreateNode(const String\&, const String\&, const String\&) method


Crea un [XmlNode](../../xmlnode/) con el tipo de nodo especificado, [XmlDocument::get_Name](../get_name/) y [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlDocument::CreateNode(const String &nodeTypeString, const String &name, const String &namespaceURI)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| nodeTypeString | const String\& | Versión [String](../../../system/string/) del [XmlNodeType](../../xmlnodetype/) del nuevo nodo. Este parámetro debe ser uno de los valores enumerados en la tabla a continuación. |
| name | const String\& | El nombre calificado del nuevo nodo. Si el nombre contiene dos puntos, se analiza en los componentes [XmlNode::get_Prefix](../../xmlnode/get_prefix/) y [XmlDocument::get_LocalName](../get_localname/). |
| namespaceURI | const String\& | El URI del espacio de nombres del nuevo nodo. |

### ReturnValue

El nuevo [XmlNode](../../xmlnode/).
## Observaciones



El parámetro **nodeTypeString** distingue entre mayúsculas y minúsculas y debe ser uno de los valores en la siguiente tabla: |||
|-|-|
| nodeTypeString | XmlNodeType |
| atributo | Attribute |
| secciónCDATA | CDATA |
| comentario | Comment |
| documento | Document |
| fragmentoDocumento | DocumentFragment |
| tipoDocumento | DocumentType |
| elemento | Element |
| referencia de entidad | EntityReference |
| instrucción de procesamiento | ProcessingInstruction |
| espacio en blanco significativo | SignificantWhitespace |
| text | Text |
| espacio en blanco | Espacio en blanco |

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::CreateNode(XmlNodeType, const String\&, const String\&) method


Crea un [XmlNode](../../xmlnode/) con el [XmlNodeType](../../xmlnodetype/) especificado, [XmlDocument::get_Name](../get_name/) y [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlDocument::CreateNode(XmlNodeType type, const String &name, const String &namespaceURI)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| type | XmlNodeType | El [XmlNodeType](../../xmlnodetype/) del nuevo nodo. |
| name | const String\& | El nombre calificado del nuevo nodo. Si el nombre contiene dos puntos, entonces se analiza en los componentes [XmlNode::get_Prefix](../../xmlnode/get_prefix/) y [XmlDocument::get_LocalName](../get_localname/). |
| namespaceURI | const String\& | El URI del espacio de nombres del nuevo nodo. |

### ReturnValue

El nuevo [XmlNode](../../xmlnode/).

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::CreateNode(XmlNodeType, const String\&, const String\&, const String\&) method


Crea un [XmlNode](../../xmlnode/) con el [XmlNodeType](../../xmlnodetype/) especificado, [XmlNode::get_Prefix](../../xmlnode/get_prefix/), [XmlDocument::get_Name](../get_name/) y [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlDocument::CreateNode(XmlNodeType type, const String &prefix, const String &name, const String &namespaceURI)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| type | XmlNodeType | El [XmlNodeType](../../xmlnodetype/) del nuevo nodo. |
| prefijo | const String\& | El prefijo del nuevo nodo. |
| name | const String\& | El nombre local del nuevo nodo. |
| namespaceURI | const String\& | El URI del espacio de nombres del nuevo nodo. |

### ReturnValue

El nuevo [XmlNode](../../xmlnode/).

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
