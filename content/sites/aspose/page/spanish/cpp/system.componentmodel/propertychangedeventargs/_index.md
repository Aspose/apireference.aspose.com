---
title: "System::ComponentModel::PropertyChangedEventArgs class"
linktitle: "PropertyChangedEventArgs"
second_title: "Aspose.Page para C++"
description: "System::ComponentModel::PropertyChangedEventArgs class. Argumentos del evento PropertyChanged. Los objetos de esta clase solo deben asignarse usando la función System::MakeObject(). Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que provocará errores de tiempo de ejecución y/o fallos de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use ese puntero para pasarlo a funciones como argumento en C++."
type: docs
weight: 1200
url: /es/cpp/system.componentmodel/propertychangedeventargs/
---
## PropertyChangedEventArgs class


Argumentos del evento PropertyChanged. Los objetos de esta clase solo deben asignarse usando la función [System::MakeObject()](../../system/makeobject/). Nunca cree una instancia de este tipo en la pila o usando el operador new, ya que provocará errores de tiempo de ejecución y/o fallos de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento.

```cpp
class PropertyChangedEventArgs : public System::EventArgs
```

## Métodos

| Método | Descripción |
| --- | --- |
| virtual [get_PropertyName](./get_propertyname/)() | Información RTTI. |
| [PropertyChangedEventArgs](./propertychangedeventargs/)(const String\&) | Inicializa los argumentos del evento PropertyChanged. |
## Campos

| Campo | Descripción |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Un miembro estático que representa un puntero compartido "vacío" [EventArgs](../../system/eventargs/) (puntero nulo). |
## Ver también

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
