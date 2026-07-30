---
title: "Namespace System::Reflection"
linktitle: "System::Reflection"
second_title: "Aspose.Font per C++"
description: "Come utilizzare il namespace System::Reflection in C++."
type: docs
weight: 5300
url: /it/cpp/system.reflection/
---



## Classi

| Classe | Descrizione |
| --- | --- |
| [Assembly](./assembly/) | [Reflection](./) classe che descrive l'assembly. Il supporto è limitato poiché le regole sono abbastanza diverse tra C# e C++. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../system/makeobject/). Non creare istanze di questo tipo nello stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento. |
| [AssemblyName](./assemblyname/) | Definisce il nome dell'assembly. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../system/makeobject/). Non creare istanze di questo tipo nello stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento. |
| [AssemblyTypeRegistration](./assemblytyperegistration/) | Singleton per registrare il tipo nell'assembly in esecuzione. |
| [AssemblyTypeRegistrationBase](./assemblytyperegistrationbase/) | Tipo base per i singleton per registrare il tipo nell'assembly in esecuzione. |
| [ConstructorInfo](./constructorinfo/) | Fornisce accesso ai metadati del costruttore. |
| [FieldInfo](./fieldinfo/) | Scopre gli attributi di un campo e fornisce accesso ai metadati del campo. |
| [MemberInfo](./memberinfo/) | Fornisce informazioni di riflessione sui membri. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../system/makeobject/). Non creare istanze di questo tipo nello stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento. |
| [MethodBase](./methodbase/) | Informazioni di base sul metodo. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../system/makeobject/). Non creare istanze di questo tipo nello stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento. |
| [MethodInfo](./methodinfo/) | Rappresenta informazioni sul metodo di classe. |
| [PropertyInfo](./propertyinfo/) | Rappresenta informazioni sulla proprietà. |
## Enums

| Enumerazione | Descrizione |
| --- | --- |
| [BindingFlags](./bindingflags/) | Definisce i membri e le modalità di ricerca dei tipi e i binding. |
| [FieldAttributes](./fieldattributes/) | Attributi del campo riflesso. |
| [MemberTypes](./membertypes/) | Segna ogni tipo di membro. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [ReflectionTypeLoadException](./reflectiontypeloadexception/) | [ReflectionTypeLoadException](./reflectiontypeloadexception/) viene lanciata dal metodo Module.GetTypes se una delle classi in un modulo non riesce a caricarsi. Non avvolgere le istanze della classe [ReflectionTypeLoadException](./reflectiontypeloadexception/) in [System::SmartPtr](../system/smartptr/). |
| [TargetInvocationException](./targetinvocationexception/) | [TargetInvocationException](./targetinvocationexception/) viene lanciata dai metodi invocati tramite riflessione. Non avvolgere le istanze della classe [TargetInvocationException](./targetinvocationexception/) in [System::SmartPtr](../system/smartptr/). |
