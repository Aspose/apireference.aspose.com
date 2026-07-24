---
title: "Класс Aspose::Page::EPS::XMP::XmpMetadata"
linktitle: "XmpMetadata"
second_title: "Aspose.Page для C++"
description: "Класс Aspose::Page::EPS::XMP::XmpMetadata. Предоставляет доступ к потоку XMP‑метаданных в C++."
type: docs
weight: 200
url: /ru/cpp/aspose.page.eps.xmp/xmpmetadata/
---
## XmpMetadata class


Предоставляет доступ к потоку метаданных [XMP](../).

```cpp
class XmpMetadata : public System::Collections::Generic::IDictionary<System::String, System::SharedPtr<XmpValue>>
```

## Методы

| Метод | Описание |
| --- | --- |
| [Add](./add/)(const System::String\&, const System::SharedPtr\<XmpValue\>\&) override | Добавляет значение в метаданные. |
| [Add](./add/)(const System::String\&, const System::SharedPtr\<System::Object\>\&) | Добавляет значение в метаданные. |
| [Add](./add/)(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) override | Добавляет пару ключ‑значение в словарь. |
| [AddArrayItem](./addarrayitem/)(System::String, System::SharedPtr\<XmpValue\>) | Добавляет значение в массив. Значение будет добавлено в конец массива. |
| [AddArrayItem](./addarrayitem/)(System::String, int32_t, System::SharedPtr\<XmpValue\>) | Добавляет значение в массив по указанному индексу. |
| [AddNamedValue](./addnamedvalue/)(System::String, System::String, System::SharedPtr\<XmpValue\>) | Добавляет именованное значение в структуру. |
| [Clear](./clear/)() override | Очищает метаданные. |
| [Contains](./contains/)(const System::String\&) const | Проверяет, содержится ли ключ в метаданных. |
| [Contains](./contains/)(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) const override | Проверяет, содержится ли указанная пара ключ‑значение в словаре. |
| [ContainsKey](./containskey/)(const System::String\&) const override | Определяет, содержит ли этот словарь указанный ключ. |
| [CopyTo](./copyto/)(System::ArrayPtr\<System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\>, int32_t) override | Копирует элементы коллекции в массив. |
| [get_Count](./get_count/)() const override | Получает количество элементов в коллекции. |
| [get_IsFixedSize](./get_isfixedsize/)() const | Проверяет, имеет ли коллекция фиксированный размер. |
| [get_IsReadOnly](./get_isreadonly/)() const override | Проверяет, является ли коллекция только для чтения. |
| [get_IsSynchronized](./get_issynchronized/)() | Проверяет, синхронизирована ли коллекция. |
| [get_Keys](./get_keys/)() const override | Получает коллекцию ключей метаданных. |
| [get_NamespaceManager](./get_namespacemanager/)() | Получает менеджер пространств имён. |
| [get_SyncRoot](./get_syncroot/)() const | Получает объект синхронизации коллекции. |
| [get_Values](./get_values/)() const override | Получает значения в метаданных. |
| [GetEnumerator](./getenumerator/)() override | Возвращает перечислитель словаря. |
| [GetNamespaceUriByPrefix](./getnamespaceuribyprefix/)(System::String) | Возвращает URI пространства имён по префиксу. |
| [GetPrefixByNamespaceUri](./getprefixbynamespaceuri/)(System::String) | Возвращает префикс по URI пространства имён. |
| [idx_get](./idx_get/)(const System::String\&) const override | Получает данные из метаданных. |
| [idx_set](./idx_set/)(const System::String\&, System::SharedPtr\<XmpValue\>) override | Устанавливает данные из метаданных. |
| [RegisterNamespaceUri](./registernamespaceuri/)(System::String, System::String) | Регистрирует URI пространства имён. |
| [RegisterNamespaceUri](./registernamespaceuri/)(System::String, System::String, System::String) | Регистрирует URI пространства имён. |
| [Remove](./remove/)(const System::String\&) override | Удаляет запись из метаданных. |
| [Remove](./remove/)(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) override | Удаляет пару ключ/значение из коллекции. |
| [SetArrayItem](./setarrayitem/)(System::String, int32_t, System::SharedPtr\<XmpValue\>) | Устанавливает значение в массиве. Предыдущее значение будет заменено новым. |
| [SetNamedValue](./setnamedvalue/)(System::String, System::String, System::SharedPtr\<XmpValue\>) | Устанавливает именованное значение в структуру. Предыдущее именованное значение, если уже существует, будет заменено новым. |
| [TryGetValue](./trygetvalue/)(const System::String\&, System::SharedPtr\<XmpValue\>\&) const override | Пытается найти ключ в словаре и получить значение, если найдено. |
## См. также

* Class [IDictionary](../../system.collections.generic/idictionary/)
* Namespace [Aspose::Page::EPS::XMP](../)
* Library [Aspose.Page for C++](../../)
