---
title: "Espacio de nombres System::Runtime::Serialization"
linktitle: "System::Runtime::Serialization"
second_title: "Aspose.Page para C++"
description: "Cómo usar el espacio de nombres System::Runtime::Serialization en C++."
type: docs
weight: 5300
url: /es/cpp/system.runtime.serialization/
---



## Clases

| Clase | Descripción |
| --- | --- |
| [FormatterConverter](./formatterconverter/) | Representa una implementación base de la interfaz [System::Runtime::Serialization::IFormatterConverter](./iformatterconverter/). |
| [IFormatterConverter](./iformatterconverter/) | Proporciona la conexión entre una instancia de [System::Runtime::Serialization::SerializationInfo](./serializationinfo/) y la clase proporcionada por el formateador que mejor se adapta a analizar los datos dentro de [System::Runtime::Serialization::SerializationInfo](./serializationinfo/). |
| [ISerializable](./iserializable/) | Interfaz de un objeto que puede serializarse. Los objetos de esta clase solo deben asignarse mediante la función [System::MakeObject()](../system/makeobject/). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que provocará errores de tiempo de ejecución y/o fallos de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento. |
| [SerializationInfo](./serializationinfo/) | Contiene un conjunto de campos con nombre que representan un objeto serializado. No implementado. Los objetos de esta clase solo deben asignarse mediante la función [System::MakeObject()](../system/makeobject/). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que provocará errores de tiempo de ejecución y/o fallos de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento. |
| [StreamingContext](./streamingcontext/) | Clase ficticia para que las clases traducidas que usan StreamingContext compilen. No administre instancias de esta clase mediante [SmartPtr](../system/smartptr/); deben asignarse solo en la pila. |
