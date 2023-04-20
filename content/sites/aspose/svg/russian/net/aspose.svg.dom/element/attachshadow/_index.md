---
title: Element.AttachShadow
second_title: Справочник по Aspose.SVG для .NET API
description: Element метод. Создает теневой корень и прикрепляет его к текущему элементу.
type: docs
weight: 230
url: /ru/net/aspose.svg.dom/element/attachshadow/
---
## Element.AttachShadow method

Создает теневой корень и прикрепляет его к текущему элементу.

```csharp
public ShadowRoot AttachShadow(ShadowRootMode mode)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| mode | ShadowRootMode | Режим, в котором будет создан теневой корень. |

### Возвращаемое значение

Созданный[`ShadowRoot`](../../shadowroot/).

### Исключения

| исключение | условие |
| --- | --- |
| Error | NotSupportedError: Элемент не поддерживает теневое дерево. |
| Error | InvalidStateError: Элемент уже имеет теневое дерево. |

### Смотрите также

* class [ShadowRoot](../../shadowroot/)
* enum [ShadowRootMode](../../shadowrootmode/)
* class [Element](../)
* пространство имен [Aspose.Svg.Dom](../../element/)
* сборка [Aspose.SVG](../../../)


