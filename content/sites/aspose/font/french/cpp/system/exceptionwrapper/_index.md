---
title: "System::ExceptionWrapper classe"
linktitle: "ExceptionWrapper"
second_title: "Aspose.Font pour C++"
description: "System::ExceptionWrapper classe. Modèle qui représente un enveloppeur d'exceptions dérivées de la classe Exception en C++."
type: docs
weight: 2600
url: /fr/cpp/system/exceptionwrapper/
---
## ExceptionWrapper class


Modèle qui représente un enveloppeur d'exceptions dérivées de la classe [Exception](../exception/).

```cpp
template<typename T>class ExceptionWrapper
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [ExceptionWrapper](./exceptionwrapper/)(std::nullptr_t) | Construit une instance nulle de la classe [ExceptionWrapper](./) qui ne représente aucune exception. |
| [ExceptionWrapper](./exceptionwrapper/)(const ExceptionPtr\&) | Construit une instance de la classe [ExceptionWrapper](./) qui contient le pointeur passé. |
| [ExceptionWrapper](./exceptionwrapper/)(const ExceptionWrapper\&) | Constructeur de copie. |
| [ExceptionWrapper](./exceptionwrapper/)(ExceptionWrapper\&&) | Constructeur de déplacement. |
| explicit [ExceptionWrapper](./exceptionwrapper/)(Args\&&...) | Constructeur qui transmet les paramètres aux constructeurs de la classe [Exception](../exception/) et crée un pointeur intelligent qui détient une nouvelle instance de la classe [Exception](../exception/). |
| static [operator new](./operatornew/)(std::size_t) |  |
| static [operator new[]](./operatornew[]/)(std::size_t) |  |
| [operator SharedPtr< Object >](./operatorsharedptr_object_/)() | Opérateur de conversion implicite vers [SharedPtr<Object>](../sharedptr/) |
| [operator->](./operator-_/)() const | Permet d'accéder aux membres de l'objet [Exception](../exception/). |
| [operator=](./operator=/)(const ExceptionWrapper\&) | Opérateur d'affectation. |
| [operator=](./operator=/)(ExceptionWrapper\&&) | Opérateur d'affectation par déplacement. |
| static [Type](./type/)() | Raccourci pour obtenir l'objet [System::TypeInfo](../typeinfo/) du type [Exception](../exception/). |
## Typedefs

| Typedef | Description |
| --- | --- |
| [ExceptionType](./exceptiontype/) | Utilisé pour les fonctions de conversion. |
## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
