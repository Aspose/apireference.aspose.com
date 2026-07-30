---
title: "classe System::TypeInfo"
linktitle: "TypeInfo"
second_title: "Aspose.Font per C++"
description: "classe System::TypeInfo. Rappresenta un tipo specifico e fornisce informazioni su di esso in C++."
type: docs
weight: 6600
url: /it/cpp/system/typeinfo/
---
## TypeInfo class


Rappresenta un tipo specifico e fornisce informazioni su di esso.

```cpp
class TypeInfo
```

## Nested classes

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [AddAttribute](./addattribute/)(const ObjectPtr\&) | Aggiunge l'attributo specificato all'elenco degli attributi del tipo. |
| [AddDefaultConstructor](./adddefaultconstructor/)() | Imposta il costruttore predefinito per il tipo T. |
| [AddDefaultConstructor](./adddefaultconstructor/)(DefaultConstructor) | Imposta il costruttore predefinito tramite il functor che crea l'istanza della classe. |
| [AddMember](./addmember/)(const SharedPtr\<System::Reflection::MemberInfo\>\&) | Aggiunge il membro specificato all'elenco dei membri del tipo. |
| static [BoxedValueType](./boxedvaluetype/)() | Fornisce una struttura [TypeInfo](./) unica per il tipo [BoxedValue](./boxedvalue/) da condividere tra più classi Boxed*. |
| [Equals](./equals/)(const TypeInfo\&) const |  |
| [get_Assembly](./get_assembly/)() const | NON IMPLEMENTATO. Restituisce un puntatore all'assembly in cui è dichiarato il tipo rappresentato dall'oggetto corrente. |
| [get_AssemblyQualifiedName](./get_assemblyqualifiedname/)() const | NON IMPLEMENTATO. Restituisce il nome completo includendo il nome dell'assembly del tipo rappresentato dall'oggetto corrente. |
| [get_BaseType](./get_basetype/)() const | Restituisce il descrittore del tipo base. |
| [get_ContainsGenericParameters](./get_containsgenericparameters/)() const | Ottiene un valore che indica se l'oggetto Type corrente ha parametri di tipo non ancora sostituiti da tipi specifici. |
| [get_DeclaredMember](./get_declaredmember/)(const String\&) const | Ottiene l'elenco dei membri con il nome specificato. |
| [get_FullName](./get_fullname/)() const | Restituisce il nome completo (ma senza il nome dell'assembly) del tipo rappresentato dall'oggetto corrente. |
| [get_GenericTypeArguments](./get_generictypearguments/)() const | Ottiene un array degli argomenti di tipo generico per questo tipo. |
| [get_IsAbstract](./get_isabstract/)() const | Ottiene un valore che indica se il Type è astratto e deve essere sovrascritto. |
| [get_IsArray](./get_isarray/)() const | Ottiene un valore che indica se il tipo è un array. |
| [get_IsClass](./get_isclass/)() const | Ottiene un valore che indica se il Type è una classe o un delegate; cioè, non è un tipo valore o un'interfaccia. |
| [get_IsEnum](./get_isenum/)() const | Ottiene un valore che indica se il Type corrente rappresenta un'enumerazione. |
| [get_IsGenericType](./get_isgenerictype/)() const |  |
| [get_IsGenericTypeDefinition](./get_isgenerictypedefinition/)() const | Ottiene un valore che indica se il Type corrente rappresenta una definizione di tipo generico, da cui possono essere costruiti altri tipi generici. |
| [get_IsInterface](./get_isinterface/)() const | Ottiene un valore che indica se il Tipo è un'interfaccia; cioè, non una classe o un tipo valore. |
| [get_IsSealed](./get_issealed/)() const | Ottiene un valore che indica se il Tipo è dichiarato sealed. |
| [get_IsValueType](./get_isvaluetype/)() const | Ottiene un valore che indica se il Tipo è un tipo valore. |
| [get_IsVisible](./get_isvisible/)() const | Ottiene un valore che indica se il Tipo può essere accessibile dal codice al di fuori dell'assembly. |
| [get_Name](./get_name/)() const | Restituisce il nome del tipo rappresentato dall'oggetto corrente. |
| [get_Namespace](./get_namespace/)() const | Ottiene lo spazio dei nomi del Tipo. |
| [GetConstructor](./getconstructor/)(const ArrayPtr\<TypeInfo\>\&) const | Cerca un costruttore di istanza pubblico i cui parametri corrispondono ai tipi nell'array specificato. |
| [GetConstructors](./getconstructors/)(System::Reflection::BindingFlags) const | cerca i costruttori definiti per il Tipo corrente, utilizzando i BindingFlags specificati. |
| [GetConstructors](./getconstructors/)() const | Restituisce tutti i costruttori pubblici definiti per il Tipo corrente. |
| [GetCustomAttribute](./getcustomattribute/)(const TypeInfo\&) const | Cerca l'attributo personalizzato applicato che ha il tipo specificato e applicato al tipo rappresentato dall'oggetto corrente. |
| [GetCustomAttributes](./getcustomattributes/)() const | Restituisce un array contenente oggetti che rappresentano tutti gli attributi personalizzati applicati al tipo. |
| [GetCustomAttributes](./getcustomattributes/)(const TypeInfo\&, bool) const | Restituisce un array contenente oggetti che rappresentano attributi specifici applicati al tipo. |
| [GetElementType](./getelementtype/)() const | NON IMPLEMENTATO. |
| [GetField](./getfield/)(const System::String\&, System::Reflection::BindingFlags) const | Cerca il campo specificato, utilizzando le restrizioni di binding specificate. |
| [GetFields](./getfields/)(System::Reflection::BindingFlags) const | Cerca i campi definiti per il Tipo corrente, utilizzando le restrizioni di binding specificate. |
| [GetGenericArguments](./getgenericarguments/)() const | Ottiene un array degli argomenti di tipo generico per questo tipo. |
| [GetHashCode](./gethashcode/)() const | Restituisce un codice hash associato a questa istanza. |
| [GetInterfaces](./getinterfaces/)() const | Ottiene tutte le interfacce implementate o ereditate dal Tipo corrente. |
| [GetMember](./getmember/)(const String\&) const | Ottiene l'elenco dei membri con il nome specificato. |
| [GetMethod](./getmethod/)(const String\&) const | Ottiene il metodo con il nome specificato. |
| [GetProperties](./getproperties/)() const | Restituisce tutte le proprietà pubbliche del Tipo corrente. |
| [GetProperties](./getproperties/)(System::Reflection::BindingFlags) const | Cerca le proprietà del Tipo corrente, utilizzando le restrizioni di binding specificate. |
| [GetTemplParamType](./gettemplparamtype/)() const | Ottiene il descrittore del tipo del parametro del modello. |
| [Hash](./hash/)() const | Restituisce un valore hash associato al tipo rappresentato dall'oggetto corrente. |
| [IsAssignableFrom](./isassignablefrom/)(const TypeInfo\&) const | Determina se un'istanza di un tipo specificato può essere assegnata a una variabile del tipo corrente. |
| [IsDefined](./isdefined/)(const TypeInfo\&, bool) const | NON IMPLEMENTATO. Indica se uno o più attributi del tipo specificato o dei suoi tipi derivati sono applicati a questo membro. |
| [IsInstanceOfType](./isinstanceoftype/)(const SharedPtr\<Object\>\&) const | Determina se l'oggetto specificato è un'istanza del tipo corrente. |
| [IsSubclassOf](./issubclassof/)(const TypeInfo\&) const | Determina se il tipo rappresentato dall'oggetto corrente è una sottoclasse della classe specificata. |
| [operator!=](./operator!=/)(const TypeInfo\&) const | Determina se gli oggetti [TypeInfo](./) corrente e specificato non sono uguali. |
| [operator!=](./operator!=/)(std::nullptr_t) const | Determina se l'oggetto [TypeInfo](./) corrente non è un oggetto nullo, cioè rappresenta qualche tipo. |
| [operator==](./operator==/)(const TypeInfo\&) const | Determina se gli oggetti [TypeInfo](./) corrente e specificato sono uguali. |
| [operator==](./operator==/)(std::nullptr_t) const | Determina se l'oggetto [TypeInfo](./) corrente è un oggetto nullo, cioè non rappresenta alcun tipo. |
| [reset](./reset/)() | Imposta [TypeInfo](./) a null. |
| [set_IsValueType](./set_isvaluetype/)(bool) | Imposta un valore che indica se il Tipo è un tipo valore. |
| [SetBaseType](./setbasetype/)(GetTypeInfoFunPtr) | Imposta il descrittore del tipo base. |
| [SetTemplParamType](./settemplparamtype/)(const TypeInfo\&) | Imposta il descrittore del tipo del parametro di modello. |
| static [StringHash](./stringhash/)(const char_t *) | Calcola l'hash per la stringa specificata. |
| [ToString](./tostring/)() const | Restituisce una stringa contenente il nome del tipo rappresentato dall'oggetto corrente. |
| static [Type](./type/)() | Restituisce un oggetto [TypeInfo](./) che rappresenta la classe [TypeInfo](./). |
| [TypeInfo](./typeinfo/)() | Costruttore predefinito (nessun tipo impostato). |
| [TypeInfo](./typeinfo/)(std::nullptr_t) | Costruttore di oggetto nullo (nessun tipo impostato). |
| [TypeInfo](./typeinfo/)(const char_t *) | Costruttore. |
| [TypeInfo](./typeinfo/)(const char_t *, uint32_t) | Costruttore. |
| [TypeInfo](./typeinfo/)(const std::type_info\&) | Costruttore. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [EmptyType](./emptytype/) | Costante che rappresenta una lista vuota di [TypeInfo](./). |
| static [EmptyTypes](./emptytypes/) | Costante che rappresenta una lista vuota di [TypeInfo](./). |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [DefaultConstructor](./defaultconstructor/) | Puntatore a funzione per costruire il tipo. |
## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
