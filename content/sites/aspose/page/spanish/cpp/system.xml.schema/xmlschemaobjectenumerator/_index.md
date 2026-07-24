---
title: "Clase System::Xml::Schema::XmlSchemaObjectEnumerator"
linktitle: "XmlSchemaObjectEnumerator"
second_title: "Aspose.Page para C++"
description: "Clase System::Xml::Schema::XmlSchemaObjectEnumerator. Representa el enumerador para la XmlSchemaObjectCollection en C++."
type: docs
weight: 5200
url: /es/cpp/system.xml.schema/xmlschemaobjectenumerator/
---
## XmlSchemaObjectEnumerator class


Representa el enumerador para la [XmlSchemaObjectCollection](../xmlschemaobjectcollection/).

```cpp
class XmlSchemaObjectEnumerator : public System::Collections::Generic::IEnumerator<SharedPtr<System::Xml::Schema::XmlSchemaObject>>
```

## Métodos

| Método | Descripción |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | Clona el iterador actual. |
| [Dispose](./dispose/)() override | No hace nada. |
| [get_Current](./get_current/)() const override | Devuelve el [XmlSchemaObject](../xmlschemaobject/) actual en la colección. |
| [MoveNext](./movenext/)() override | Se mueve al siguiente elemento de la colección. |
| [Reset](./reset/)() override | Restablece el enumerador al inicio de la colección. |
## Typedefs

| Typedef | Descripción |
| --- | --- |
| [Ptr](./ptr/) | Un alias para un puntero compartido a una instancia de esta clase. |
## Observaciones



Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../../system/makeobject/). Nunca cree instancias de este tipo en la pila ni usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallos de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento.

## Ver también

* Class [IEnumerator](../../system.collections.generic/ienumerator/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
