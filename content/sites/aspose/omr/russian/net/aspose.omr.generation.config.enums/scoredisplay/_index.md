---
title: Enum ScoreDisplay
second_title: Справочник по Aspose.OMR для .NET API
description: Aspose.OMR.Generation.Config.Enums.ScoreDisplay перечисление. Управление отображением значения счета.
type: docs
weight: 530
url: /ru/net/aspose.omr.generation.config.enums/scoredisplay/
---
## ScoreDisplay enumeration

Управление отображением значения счета.

```csharp
public enum ScoreDisplay
```

### Ценности

| Имя | Ценность | Описание |
| --- | --- | --- |
| DontDisplay | `0` | Значение балла будет скрыто от пользователя. Значение балла по-прежнему будет участвовать в распознавании и общей сумме баллов. Amount будет проигнорирован. |
| DisplayAsExtraColumn | `1` | Значение балла будет отображаться в виде дополнительного столбца и будет видно пользователю. Значение балла участвует в распознавании и общей сумме баллов. Amount отметит положение столбца оценки среди других столбцов. Пожалуйста, используйте только один такой заголовок |
| DisplayInsideCell | `2` | Значение очков будет отображаться внутри каждой ячейки. Значение очков будет помещено внутри каждого кружка. В текущей версии будет выдаваться одна цифра на пузырь или исключение. Amount будет проигнорирован. |

### Смотрите также

* пространство имен [Aspose.OMR.Generation.Config.Enums](../../aspose.omr.generation.config.enums/)
* сборка [Aspose.OMR](../../)


