---
title: "Espace de noms System::Reflection"
linktitle: "System::Reflection"
second_title: "Aspose.Page pour C++"
description: "Comment utiliser l'espace de noms System::Reflection en C++."
type: docs
weight: 4900
url: /fr/cpp/system.reflection/
---



## Classes

| Classe | Description |
| --- | --- |
| [Assembly](./assembly/) | [Reflection](./) classe décrivant l'assembly. Le support est limité car les règles sont assez différentes entre C# et C++. Les objets de cette classe doivent être alloués uniquement en utilisant la fonction [System::MakeObject()](../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en argument. |
| [AssemblyName](./assemblyname/) | Définit le nom de l'assembly. Les objets de cette classe doivent être alloués uniquement en utilisant la fonction [System::MakeObject()](../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en argument. |
| [AssemblyTypeRegistration](./assemblytyperegistration/) | Singleton pour enregistrer le type dans l'assembly en cours d'exécution. |
| [AssemblyTypeRegistrationBase](./assemblytyperegistrationbase/) | Type de base pour les singletons qui enregistrent le type dans l'assembly en cours d'exécution. |
| [ConstructorInfo](./constructorinfo/) | Fournit l'accès aux métadonnées du constructeur. |
| [FieldInfo](./fieldinfo/) | Découvre les attributs d'un champ et fournit l'accès aux métadonnées du champ. |
| [MemberInfo](./memberinfo/) | Fournit des informations de réflexion sur les membres. Les objets de cette classe doivent être alloués uniquement en utilisant la fonction [System::MakeObject()](../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en argument. |
| [MethodBase](./methodbase/) | Informations de base sur la méthode. Les objets de cette classe doivent être alloués uniquement en utilisant la fonction [System::MakeObject()](../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en argument. |
| [MethodInfo](./methodinfo/) | Représente les informations sur la méthode de classe. |
| [PropertyInfo](./propertyinfo/) | Représente les informations de propriété. |
## Enums

| Énumération | Description |
| --- | --- |
| [BindingFlags](./bindingflags/) | Définit les membres et les modes de recherche et de liaison des types. |
| [FieldAttributes](./fieldattributes/) | Attributs de champ reflétés. |
| [MemberTypes](./membertypes/) | Marque chaque type de membre. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [ReflectionTypeLoadException](./reflectiontypeloadexception/) | [ReflectionTypeLoadException](./reflectiontypeloadexception/) est levée par la méthode Module.GetTypes si l'une des classes d'un module ne peut pas être chargée. Ne jamais envelopper les instances de la classe [ReflectionTypeLoadException](./reflectiontypeloadexception/) dans un [System::SmartPtr](../system/smartptr/). |
| [TargetInvocationException](./targetinvocationexception/) | [TargetInvocationException](./targetinvocationexception/) est levée par les méthodes invoquées via la réflexion. Ne jamais envelopper les instances de la classe [TargetInvocationException](./targetinvocationexception/) dans un [System::SmartPtr](../system/smartptr/). |
