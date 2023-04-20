---
title: Interface ICSSStyleSheet
second_title: Справочник по Aspose.SVG для .NET API
description: Aspose.Svg.Dom.Css.ICSSStyleSheet интерфейс. Интерфейс CSSStyleSheet  это конкретный интерфейс используемый для представления таблицы стилей CSS т. е. таблицы стилей с типом содержимого text/css.
type: docs
weight: 660
url: /ru/net/aspose.svg.dom.css/icssstylesheet/
---
## ICSSStyleSheet interface

Интерфейс CSSStyleSheet — это конкретный интерфейс, используемый для представления таблицы стилей CSS, т. е. таблицы стилей с типом содержимого "text/css".

```csharp
public interface ICSSStyleSheet : IStyleSheet
```

## Характеристики

| Имя | Описание |
| --- | --- |
| [CSSRules](../../aspose.svg.dom.css/icssstylesheet/cssrules/) { get; } | Список всех правил CSS, содержащихся в таблице стилей. Сюда входят как наборы правил, так и at-rules. |
| [OwnerRule](../../aspose.svg.dom.css/icssstylesheet/ownerrule/) { get; } | Если эта таблица стилей получена из правила @import, атрибут ownerRule будет содержать CSSImportRule. В этом случае атрибут ownerNode в интерфейсе StyleSheet будет иметь значение null. Если таблица стилей получена из элемента или инструкции обработки, атрибут ownerRule будет иметь значение null, а атрибут ownerNode будет содержать Node. |

## Методы

| Имя | Описание |
| --- | --- |
| [DeleteRule](../../aspose.svg.dom.css/icssstylesheet/deleterule/)(int) | Используется для удаления правила из таблицы стилей. |
| [InsertRule](../../aspose.svg.dom.css/icssstylesheet/insertrule/)(string, int) | Используется для вставки нового правила в таблицу стилей. Новое правило теперь становится частью каскада. |

### Смотрите также

* interface [IStyleSheet](../istylesheet/)
* пространство имен [Aspose.Svg.Dom.Css](../../aspose.svg.dom.css/)
* сборка [Aspose.SVG](../../)


