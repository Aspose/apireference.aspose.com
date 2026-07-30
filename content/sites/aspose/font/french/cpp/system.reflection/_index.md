---
title: "Espace de noms System::Reflection"
linktitle: "System::Reflection"
second_title: "Aspose.Font pour C++"
description: "Comment utiliser l'espace de noms System::Reflection en C++."
type: docs
weight: 5300
url: /fr/cpp/system.reflection/
---



## Classes

| Classe | Description |
| --- | --- |
| [Assembly](./assembly/) | [Reflection](./) classe décrivant une assembly. Le support est limité car les règles diffèrent fortement entre C# et C++. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument. |
| [AssemblyName](./assemblyname/) | Définit le nom de l'assembly. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument. |
| [AssemblyTypeRegistration](./assemblytyperegistration/) | Singleton pour enregistrer le type dans l'assembly en cours d'exécution. |
| [AssemblyTypeRegistrationBase](./assemblytyperegistrationbase/) | Type de base pour les singletons afin d'enregistrer le type dans l'assembly en cours d'exécution. |
| [ConstructorInfo](./constructorinfo/) | Fournit l'accès aux métadonnées du constructeur. |
| [FieldInfo](./fieldinfo/) | Découvre les attributs d'un champ et fournit l'accès aux métadonnées du champ. |
| [MemberInfo](./memberinfo/) | Fournit des informations de réflexion sur les membres. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument. |
| [MethodBase](./methodbase/) | Informations de base sur la méthode. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument. |
| [MethodInfo](./methodinfo/) | Représente les informations sur la méthode de classe. |
| [PropertyInfo](./propertyinfo/) | Représente les informations de propriété. |
## Enums

| Énumération | Description |
| --- | --- |
| [BindingFlags](./bindingflags/) | Définit les membres et les modes de recherche de types ainsi que les liaisons. |
| [FieldAttributes](./fieldattributes/) | Attributs de champ reflétés. |
| [MemberTypes](./membertypes/) | Marque chaque type de membre. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [ReflectionTypeLoadException](./reflectiontypeloadexception/) | [ReflectionTypeLoadException](./reflectiontypeloadexception/) est levée par la méthode Module.GetTypes si l'une des classes d'un module ne parvient pas à se charger. N'enveloppez jamais les instances de la classe [ReflectionTypeLoadException](./reflectiontypeloadexception/) dans un [System::SmartPtr](../system/smartptr/). |
| [TargetInvocationException](./targetinvocationexception/) | [TargetInvocationException](./targetinvocationexception/) est levée par les méthodes invoquées via la réflexion. N'enveloppez jamais les instances de la classe [TargetInvocationException](./targetinvocationexception/) dans un [System::SmartPtr](../system/smartptr/). |
