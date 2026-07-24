---
title: "System::Xml::XmlTextReader::MoveToAttribute method"
linktitle: "MoveToAttribute"
second_title: "Aspose.Page para C++"
description: "System::Xml::XmlTextReader::MoveToAttribute method. Se mueve al atributo con el índice especificado en C++."
type: docs
weight: 3800
url: /es/cpp/system.xml/xmltextreader/movetoattribute/
---
## XmlTextReader::MoveToAttribute(int32_t) method


Se mueve al atributo con el índice especificado.

```cpp
void System::Xml::XmlTextReader::MoveToAttribute(int32_t i) override
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| i | int32_t | El índice del atributo. |

## Ver también

* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::MoveToAttribute(String, String) method


Se mueve al atributo con el nombre local y el URI del espacio de nombres especificados.

```cpp
bool System::Xml::XmlTextReader::MoveToAttribute(String localName, String namespaceURI) override
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| localName | String | El nombre local del atributo. |
| namespaceURI | String | El URI del espacio de nombres del atributo. |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the reader's position does not change.

## Ver también

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextReader::MoveToAttribute(String) method


Se mueve al atributo con el nombre especificado.

```cpp
bool System::Xml::XmlTextReader::MoveToAttribute(String name) override
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| name | String | El nombre calificado del atributo. |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the reader's position does not change.

## Ver también

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
