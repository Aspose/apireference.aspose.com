---
title: "Spazio dei nomi System::Reflection"
linktitle: "System::Reflection"
second_title: "Aspose.Page per C++"
description: "Come utilizzare lo spazio dei nomi System::Reflection in C++."
type: docs
weight: 4900
url: /it/cpp/system.reflection/
---



## Classi

| Classe | Descrizione |
| --- | --- |
| [Assembly](./assembly/) | [Reflection](./) classe che descrive l'assembly. Il supporto è limitato poiché le regole sono molto diverse tra C# e C++. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento. |
| [AssemblyName](./assemblyname/) | Definisce il nome dell'assembly. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento. |
| [AssemblyTypeRegistration](./assemblytyperegistration/) | Singleton per registrare il tipo nell'assembly in esecuzione. |
| [AssemblyTypeRegistrationBase](./assemblytyperegistrationbase/) | Tipo base per i singleton che registrano il tipo nell'assembly in esecuzione. |
| [ConstructorInfo](./constructorinfo/) | Fornisce l'accesso ai metadati del costruttore. |
| [FieldInfo](./fieldinfo/) | Scopre gli attributi di un campo e fornisce l'accesso ai metadati del campo. |
| [MemberInfo](./memberinfo/) | Fornisce informazioni di riflessione sui membri. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento. |
| [MethodBase](./methodbase/) | Informazioni di base sul metodo. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento. |
| [MethodInfo](./methodinfo/) | Rappresenta le informazioni sul metodo di classe. |
| [PropertyInfo](./propertyinfo/) | Rappresenta le informazioni sulla proprietà. |
## Enums

| Enumerazione | Descrizione |
| --- | --- |
| [BindingFlags](./bindingflags/) | Definisce i membri e le modalità di ricerca e collegamento dei tipi. |
| [FieldAttributes](./fieldattributes/) | Attributi del campo riflessi. |
| [MemberTypes](./membertypes/) | Segna ogni tipo di membro. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [ReflectionTypeLoadException](./reflectiontypeloadexception/) | [ReflectionTypeLoadException](./reflectiontypeloadexception/) viene sollevata dal metodo Module.GetTypes se una delle classi in un modulo non riesce a caricarsi. Non avvolgere mai le istanze della classe [ReflectionTypeLoadException](./reflectiontypeloadexception/) in un [System::SmartPtr](../system/smartptr/). |
| [TargetInvocationException](./targetinvocationexception/) | [TargetInvocationException](./targetinvocationexception/) viene sollevata dai metodi invocati tramite riflessione. Non avvolgere mai le istanze della classe [TargetInvocationException](./targetinvocationexception/) in un [System::SmartPtr](../system/smartptr/). |
