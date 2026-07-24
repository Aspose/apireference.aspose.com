---
title: "Clase System::Xml::XmlNodeChangedEventArgs"
linktitle: "XmlNodeChangedEventArgs"
second_title: "Aspose.Page para C++"
description: "Clase System::Xml::XmlNodeChangedEventArgs. Proporciona datos para los eventos XmlDocument::NodeChanged, XmlDocument::NodeChanging, XmlDocument::NodeInserted, XmlDocument::NodeInserting, XmlDocument::NodeRemoved y XmlDocument::NodeRemoving en C++."
type: docs
weight: 2600
url: /es/cpp/system.xml/xmlnodechangedeventargs/
---
## XmlNodeChangedEventArgs class


Proporciona datos para los eventos **XmlDocument::NodeChanged**, **XmlDocument::NodeChanging**, **XmlDocument::NodeInserted**, **XmlDocument::NodeInserting**, **XmlDocument::NodeRemoved** y **XmlDocument::NodeRemoving**.

```cpp
class XmlNodeChangedEventArgs : public System::EventArgs
```

## Métodos

| Método | Descripción |
| --- | --- |
| [get_Action](./get_action/)() | Devuelve un valor que indica qué tipo de evento de cambio de nodo está ocurriendo. |
| [get_NewParent](./get_newparent/)() | Devuelve el valor de [XmlNode::get_ParentNode](../xmlnode/get_parentnode/) después de que la operación se complete. |
| [get_NewValue](./get_newvalue/)() | Devuelve el nuevo valor del nodo. |
| [get_Node](./get_node/)() | Devuelve el [XmlNode](../xmlnode/) que se está añadiendo, eliminando o modificando. |
| [get_OldParent](./get_oldparent/)() | Devuelve el valor de [XmlNode::get_ParentNode](../xmlnode/get_parentnode/) antes de que la operación comenzara. |
| [get_OldValue](./get_oldvalue/)() | Devuelve el valor original del nodo. |
| [XmlNodeChangedEventArgs](./xmlnodechangedeventargs/)(const SharedPtr\<XmlNode\>\&, const SharedPtr\<XmlNode\>\&, const SharedPtr\<XmlNode\>\&, const String\&, const String\&, XmlNodeChangedAction) | Inicializa una nueva instancia de la clase [XmlNodeChangedEventArgs](./). |
## Campos

| Campo | Descripción |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Un miembro estático que representa un puntero compartido "vacío" [EventArgs](../../system/eventargs/) (puntero nulo). |
## Typedefs

| Typedef | Descripción |
| --- | --- |
| [Ptr](./ptr/) | Un alias para un puntero compartido a una instancia de esta clase. |
## Observaciones



Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../../system/makeobject/). Nunca cree instancias de este tipo en la pila ni usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallos de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento.

## Ver también

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
