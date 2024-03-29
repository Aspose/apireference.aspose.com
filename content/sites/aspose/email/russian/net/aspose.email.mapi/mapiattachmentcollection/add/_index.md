---
title: Add
second_title: Справочник по Aspose.Email для .NET API
description: Добавляет новое вложение как встроенное сообщение.
type: docs
weight: 20
url: /ru/net/aspose.email.mapi/mapiattachmentcollection/add/
---
## Add(string, MapiMessage) {#add_2}

Добавляет новое вложение как встроенное сообщение.

```csharp
public void Add(string name, MapiMessage msg)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| name | String | Имя вложения. |
| msg | MapiMessage | [`MapiMessage`](../../mapimessage)который представляет прикрепленное сообщение. |

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | бросает, если сообщение равно null. |

### Смотрите также

* class [MapiMessage](../../mapimessage)
* class [MapiAttachmentCollection](../../mapiattachmentcollection)
* пространство имен [Aspose.Email.Mapi](../../mapiattachmentcollection)
* сборка [Aspose.Email](../../../)

---

## Add(string, byte[]) {#add_3}

Добавляет новое вложение.

```csharp
public void Add(string name, byte[] data)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| name | String | Имя вложения. |
| data | Byte[] | Данные вложения. |

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | бросает, если имя вложения равно null или пусто. |
| ArgumentNullException | бросает, если данные вложения пусты. |

### Смотрите также

* class [MapiAttachmentCollection](../../mapiattachmentcollection)
* пространство имен [Aspose.Email.Mapi](../../mapiattachmentcollection)
* сборка [Aspose.Email](../../../)

---

## Add(MapiAttachment) {#add}

Добавляет объект в конецCollection .

```csharp
public void Add(MapiAttachment item)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| item | MapiAttachment | Объект, который нужно добавить в конецCollection. Значение может быть нулевым для ссылочных типов. |

### Смотрите также

* class [MapiAttachment](../../mapiattachment)
* class [MapiAttachmentCollection](../../mapiattachmentcollection)
* пространство имен [Aspose.Email.Mapi](../../mapiattachmentcollection)
* сборка [Aspose.Email](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Email.dll -->
