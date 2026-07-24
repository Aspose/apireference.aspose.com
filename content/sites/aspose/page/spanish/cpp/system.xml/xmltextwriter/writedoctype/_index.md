---
title: "Método System::Xml::XmlTextWriter::WriteDocType"
linktitle: "WriteDocType"
second_title: "Aspose.Page para C++"
description: "Método System::Xml::XmlTextWriter::WriteDocType. Escribe la declaración DOCTYPE con el nombre especificado y atributos opcionales en C++."
type: docs
weight: 2500
url: /es/cpp/system.xml/xmltextwriter/writedoctype/
---
## XmlTextWriter::WriteDocType method


Escribe la declaración DOCTYPE con el nombre especificado y atributos opcionales.

```cpp
void System::Xml::XmlTextWriter::WriteDocType(const String &name, const String &pubid, const String &sysid, const String &subset) override
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| name | const String\& | El nombre del DOCTYPE. Debe no estar vacío. |
| pubid | const String\& | Si no es nulo, también escribe PUBLIC "pubid" "sysid" donde **pubid** y **sysid** se reemplazan con el valor de los argumentos proporcionados. |
| sysid | const String\& | Si **pubid** es nulo y **sysid** no lo es, escribe SYSTEM "sysid" donde **sysid** se reemplaza con el valor de este argumento. |
| subset | const String\& | Si no es nulo, escribe [subset] donde subset se reemplaza con el valor de este argumento. |

## Ver también

* Class [String](../../../system/string/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
