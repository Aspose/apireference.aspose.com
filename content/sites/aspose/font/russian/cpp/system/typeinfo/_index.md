---
title: "System::TypeInfo class"
linktitle: "TypeInfo"
second_title: "Aspose.Font для C++"
description: "Класс System::TypeInfo. Представляет конкретный тип и предоставляет информацию о нём в C++."
type: docs
weight: 6600
url: /ru/cpp/system/typeinfo/
---
## TypeInfo class


Представляет конкретный тип и предоставляет информацию о нём.

```cpp
class TypeInfo
```

## Nested classes

## Методы

| Метод | Описание |
| --- | --- |
| [AddAttribute](./addattribute/)(const ObjectPtr\&) | Добавляет указанный атрибут в список атрибутов типа. |
| [AddDefaultConstructor](./adddefaultconstructor/)() | Устанавливает конструктор по умолчанию для типа T. |
| [AddDefaultConstructor](./adddefaultconstructor/)(DefaultConstructor) | Устанавливает конструктор по умолчанию с помощью функторa, который создает экземпляр класса. |
| [AddMember](./addmember/)(const SharedPtr\<System::Reflection::MemberInfo\>\&) | Добавляет указанный член в список членов типа. |
| static [BoxedValueType](./boxedvaluetype/)() | Предоставляет уникальную структуру [TypeInfo](./) для типа [BoxedValue](./boxedvalue/), которую могут использовать несколько классов Boxed*. |
| [Equals](./equals/)(const TypeInfo\&) const |  |
| [get_Assembly](./get_assembly/)() const | НЕ РЕАЛИЗОВАНО. Возвращает указатель на сборку, в которой объявлен тип, представленный текущим объектом. |
| [get_AssemblyQualifiedName](./get_assemblyqualifiedname/)() const | НЕ РЕАЛИЗОВАНО. Возвращает полностью квалифицированное имя, включающее имя сборки, типа, представленного текущим объектом. |
| [get_BaseType](./get_basetype/)() const | Возвращает дескриптор базового типа. |
| [get_ContainsGenericParameters](./get_containsgenericparameters/)() const | Возвращает значение, указывающее, имеет ли текущий объект Type параметризованные типы, которые не заменены конкретными типами. |
| [get_DeclaredMember](./get_declaredmember/)(const String\&) const | Получает список членов с указанным именем. |
| [get_FullName](./get_fullname/)() const | Возвращает полностью квалифицированное имя (без имени сборки) типа, представленного текущим объектом. |
| [get_GenericTypeArguments](./get_generictypearguments/)() const | Возвращает массив аргументов обобщённого типа для этого типа. |
| [get_IsAbstract](./get_isabstract/)() const | Возвращает значение, указывающее, является ли Type абстрактным и требует переопределения. |
| [get_IsArray](./get_isarray/)() const | Возвращает значение, указывающее, является ли тип массивом. |
| [get_IsClass](./get_isclass/)() const | Возвращает значение, указывающее, является ли Type классом или делегатом; то есть не типом-значением и не интерфейсом. |
| [get_IsEnum](./get_isenum/)() const | Возвращает значение, указывающее, представляет ли текущий Type перечисление. |
| [get_IsGenericType](./get_isgenerictype/)() const |  |
| [get_IsGenericTypeDefinition](./get_isgenerictypedefinition/)() const | Возвращает значение, указывающее, представляет ли текущий Type определение обобщённого типа, из которого могут быть построены другие обобщённые типы. |
| [get_IsInterface](./get_isinterface/)() const | Получает значение, указывающее, является ли Type интерфейсом; то есть не классом и не типом значения. |
| [get_IsSealed](./get_issealed/)() const | Получает значение, указывающее, объявлен ли Type как sealed. |
| [get_IsValueType](./get_isvaluetype/)() const | Получает значение, указывающее, является ли Type типом значения. |
| [get_IsVisible](./get_isvisible/)() const | Получает значение, указывающее, может ли Type быть доступен из кода за пределами сборки. |
| [get_Name](./get_name/)() const | Возвращает имя типа, представленного текущим объектом. |
| [get_Namespace](./get_namespace/)() const | Получает пространство имён Type. |
| [GetConstructor](./getconstructor/)(const ArrayPtr\<TypeInfo\>\&) const | Ищет публичный конструктор экземпляра, параметры которого соответствуют типам в указанном массиве. |
| [GetConstructors](./getconstructors/)(System::Reflection::BindingFlags) const | Ищет конструкторы, определённые для текущего Type, используя указанные BindingFlags. |
| [GetConstructors](./getconstructors/)() const | Возвращает все публичные конструкторы, определённые для текущего Type. |
| [GetCustomAttribute](./getcustomattribute/)(const TypeInfo\&) const | Ищет пользовательский атрибут указанного типа, применённый к типу, представленному текущим объектом. |
| [GetCustomAttributes](./getcustomattributes/)() const | Возвращает массив, содержащий объекты, представляющие все пользовательские атрибуты, применённые к типу. |
| [GetCustomAttributes](./getcustomattributes/)(const TypeInfo\&, bool) const | Возвращает массив, содержащий объекты, представляющие конкретные атрибуты, применённые к типу. |
| [GetElementType](./getelementtype/)() const | НЕ РЕАЛИЗОВАНО. |
| [GetField](./getfield/)(const System::String\&, System::Reflection::BindingFlags) const | Ищет указанный поле, используя указанные ограничения привязки. |
| [GetFields](./getfields/)(System::Reflection::BindingFlags) const | Ищет поля, определённые для текущего Type, используя указанные ограничения привязки. |
| [GetGenericArguments](./getgenericarguments/)() const | Возвращает массив аргументов обобщённого типа для этого типа. |
| [GetHashCode](./gethashcode/)() const | Возвращает хеш‑код, связанный с этим экземпляром. |
| [GetInterfaces](./getinterfaces/)() const | Получает все интерфейсы, реализованные или унаследованные текущим Type. |
| [GetMember](./getmember/)(const String\&) const | Получает список членов с указанным именем. |
| [GetMethod](./getmethod/)(const String\&) const | Получает метод с указанным именем. |
| [GetProperties](./getproperties/)() const | Возвращает все публичные свойства текущего Type. |
| [GetProperties](./getproperties/)(System::Reflection::BindingFlags) const | Ищет свойства текущего Type, используя указанные ограничения привязки. |
| [GetTemplParamType](./gettemplparamtype/)() const | Получает дескриптор типа параметра шаблона. |
| [Hash](./hash/)() const | Возвращает хеш‑значение, связанное с типом, представленным текущим объектом. |
| [IsAssignableFrom](./isassignablefrom/)(const TypeInfo\&) const | Определяет, может ли экземпляр указанного типа быть присвоен переменной текущего типа. |
| [IsDefined](./isdefined/)(const TypeInfo\&, bool) const | НЕ РЕАЛИЗОВАНО. Указывает, применён ли один или несколько атрибутов указанного типа или его производных к этому члену. |
| [IsInstanceOfType](./isinstanceoftype/)(const SharedPtr\<Object\>\&) const | Определяет, является ли указанный объект экземпляром текущего типа. |
| [IsSubclassOf](./issubclassof/)(const TypeInfo\&) const | Определяет, является ли тип, представленный текущим объектом, подклассом указанного класса. |
| [operator!=](./operator!=/)(const TypeInfo\&) const | Определяет, не равны ли текущий и указанный объекты [TypeInfo](./). |
| [operator!=](./operator!=/)(std::nullptr_t) const | Определяет, не является ли текущий объект [TypeInfo](./) нулевым объектом, т. е. представляет некоторый тип. |
| [operator==](./operator==/)(const TypeInfo\&) const | Определяет, равны ли текущий и указанный объекты [TypeInfo](./). |
| [operator==](./operator==/)(std::nullptr_t) const | Определяет, является ли текущий объект [TypeInfo](./) нулевым объектом, т. е. не представляет никакого типа. |
| [reset](./reset/)() | Устанавливает [TypeInfo](./) в значение null. |
| [set_IsValueType](./set_isvaluetype/)(bool) | Устанавливает значение, указывающее, является ли тип типом значения. |
| [SetBaseType](./setbasetype/)(GetTypeInfoFunPtr) | Устанавливает дескриптор базового типа. |
| [SetTemplParamType](./settemplparamtype/)(const TypeInfo\&) | Устанавливает дескриптор типа параметра шаблона. |
| static [StringHash](./stringhash/)(const char_t *) | Вычисляет хеш для указанной строки. |
| [ToString](./tostring/)() const | Возвращает строку, содержащую имя типа, представленного текущим объектом. |
| static [Type](./type/)() | Возвращает объект [TypeInfo](./), представляющий класс [TypeInfo](./). |
| [TypeInfo](./typeinfo/)() | Конструктор по умолчанию (тип не установлен). |
| [TypeInfo](./typeinfo/)(std::nullptr_t) | Конструктор нулевого объекта (тип не установлен). |
| [TypeInfo](./typeinfo/)(const char_t *) | Конструктор. |
| [TypeInfo](./typeinfo/)(const char_t *, uint32_t) | Конструктор. |
| [TypeInfo](./typeinfo/)(const std::type_info\&) | Конструктор. |
## Поля

| Поле | Описание |
| --- | --- |
| static [EmptyType](./emptytype/) | Константа, представляющая пустой список [TypeInfo](./). |
| static [EmptyTypes](./emptytypes/) | Константа, представляющая пустой список [TypeInfo](./). |
## Typedefs

| Определение типа | Описание |
| --- | --- |
| [DefaultConstructor](./defaultconstructor/) | Указатель на функцию для создания типа. |
## См. также

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
