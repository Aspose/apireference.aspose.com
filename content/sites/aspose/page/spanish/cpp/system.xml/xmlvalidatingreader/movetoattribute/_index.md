---
title: "System::Xml::XmlValidatingReader::MoveToAttribute método"
linktitle: "MoveToAttribute"
second_title: "Aspose.Page para C++"
description: "System::Xml::XmlValidatingReader::MoveToAttribute método. Se mueve al atributo con el índice especificado en C++."
type: docs
weight: 3500
url: /es/cpp/system.xml/xmlvalidatingreader/movetoattribute/
---
## XmlValidatingReader::MoveToAttribute(int32_t) method


Se mueve al atributo con el índice especificado.

```cpp
void System::Xml::XmlValidatingReader::MoveToAttribute(int32_t i) override
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| i | int32_t | El índice del atributo. |

## Ver también

* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlValidatingReader::MoveToAttribute(String, String) method


Se desplaza al atributo con el nombre local y el espacio de nombres Uniform Resource Identifier (URI) especificados.

```cpp
bool System::Xml::XmlValidatingReader::MoveToAttribute(String localName, String namespaceURI) override
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| localName | String | El nombre local del atributo. |
| namespaceURI | String | El URI del espacio de nombres del atributo. |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the position of the reader does not change.

## Ver también

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlValidatingReader::MoveToAttribute(String) method


Se mueve al atributo con el nombre especificado.

```cpp
bool System::Xml::XmlValidatingReader::MoveToAttribute(String name) override
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| name | String | El nombre calificado del atributo. |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the position of the reader does not change.

## Ver también

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
