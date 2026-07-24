---
title: "System::Reflection namespace"
linktitle: "System::Reflection"
second_title: "Aspose.Page voor C++"
description: "Hoe gebruik je de System::Reflection namespace in C++."
type: docs
weight: 4900
url: /nl/cpp/system.reflection/
---



## Klassen

| Klasse | Beschrijving |
| --- | --- |
| [Assembly](./assembly/) | [Reflection](./) klasse die een assembly beschrijft. De ondersteuning is beperkt omdat de regels behoorlijk verschillend zijn tussen C# en C++. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven. |
| [AssemblyName](./assemblyname/) | Definieert de naam van de assembly. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven. |
| [AssemblyTypeRegistration](./assemblytyperegistration/) | Singleton om een type te registreren in de uitvoerende assembly. |
| [AssemblyTypeRegistrationBase](./assemblytyperegistrationbase/) | Basistype voor singletons om een type te registreren in de uitvoerende assembly. |
| [ConstructorInfo](./constructorinfo/) | Biedt toegang tot constructor‑metadata. |
| [FieldInfo](./fieldinfo/) | Ontdekt de attributen van een veld en biedt toegang tot veld‑metadata. |
| [MemberInfo](./memberinfo/) | Biedt reflectie‑informatie over leden. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven. |
| [MethodBase](./methodbase/) | Basisinformatie over een methode. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven. |
| [MethodInfo](./methodinfo/) | Stelt informatie over een klassemethode voor. |
| [PropertyInfo](./propertyinfo/) | Stelt eigenschapsinformatie voor. |
## Enums

| Enum | Beschrijving |
| --- | --- |
| [BindingFlags](./bindingflags/) | Definieert leden- en type‑opzoekmodi en bindingen. |
| [FieldAttributes](./fieldattributes/) | Gereflecteerde veldattributen. |
| [MemberTypes](./membertypes/) | Markeert elk type lid. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [ReflectionTypeLoadException](./reflectiontypeloadexception/) | [ReflectionTypeLoadException](./reflectiontypeloadexception/) wordt gegooid door de Module.GetTypes‑methode als een van de klassen in een module niet kan worden geladen. Wikkel de [ReflectionTypeLoadException](./reflectiontypeloadexception/) klasse‑instanties nooit in een [System::SmartPtr](../system/smartptr/). |
| [TargetInvocationException](./targetinvocationexception/) | [TargetInvocationException](./targetinvocationexception/) wordt gegooid door methoden die via reflectie worden aangeroepen. Wikkel de [TargetInvocationException](./targetinvocationexception/) klasse‑instanties nooit in een [System::SmartPtr](../system/smartptr/). |
