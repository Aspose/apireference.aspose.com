---
title: Class XpsPath
second_title: Справочник по Aspose.Page для .NET API
description: Aspose.Page.XPS.XpsModel.XpsPath сорт. Класс инкапсулирующий функции элемента Path. Этот элемент является единственным средством добавления векторной графики и изображений на фиксированную страницу. Он определяет одну векторную графику которая будет отображаться на странице.
type: docs
weight: 3260
url: /ru/net/aspose.page.xps.xpsmodel/xpspath/
---
## XpsPath class

Класс, инкапсулирующий функции элемента Path. Этот элемент является единственным средством добавления векторной графики и изображений на фиксированную страницу. Он определяет одну векторную графику, которая будет отображаться на странице.

```csharp
public sealed class XpsPath : XpsContentElement
```

## Характеристики

| Имя | Описание |
| --- | --- |
| [Clip](../../aspose.page.xps.xpsmodel/xpscontentelement/clip/) { get; set; } | Возвращает/задает экземпляр геометрии пути, ограничивающий визуализируемую область элемента. |
| [Count](../../aspose.page.xps.xpsmodel/xpselement/count/) { get; } | Возвращает количество дочерних элементов. |
| [Data](../../aspose.page.xps.xpsmodel/xpspath/data/) { get; set; } | Возвращает/устанавливает геометрию пути. |
| [Fill](../../aspose.page.xps.xpsmodel/xpspath/fill/) { get; set; } | Возвращает/задает кисть, используемую для рисования геометрии, заданной свойством Data пути. |
| [HyperlinkTarget](../../aspose.page.xps.xpsmodel/xpshyperlinkelement/hyperlinktarget/) { get; set; } | Возвращает/задает целевой объект гиперссылки. |
| [Item](../../aspose.page.xps.xpsmodel/xpselement/item/) { get; } | Предоставляет доступ к дочерним элементам по индексу*i* . |
| [Opacity](../../aspose.page.xps.xpsmodel/xpscontentelement/opacity/) { get; set; } | Возвращает/устанавливает значение, определяющее равномерную прозрачность элемента. |
| [OpacityMask](../../aspose.page.xps.xpsmodel/xpscontentelement/opacitymask/) { get; set; } | Возвращает/задает кисть, задающую маску альфа-значений , которая применяется к элементу таким же образом, как атрибут непрозрачности, , но допускает разные значения альфа-канала для разных областей элемента. |
| [RenderTransform](../../aspose.page.xps.xpsmodel/xpscontentelement/rendertransform/) { get; set; } | Возвращает/задает матрицу аффинного преобразования, устанавливающую новую координатную рамку для всех атрибутов элемента и для всех дочерних элементов (если есть). |
| [Stroke](../../aspose.page.xps.xpsmodel/xpspath/stroke/) { get; set; } | Возвращает/задает кисть, используемую для рисования штриха. |
| [StrokeDashArray](../../aspose.page.xps.xpsmodel/xpspath/strokedasharray/) { get; set; } | Возвращает/задает массив, определяющий длину штрихов и промежутков штриха контура. |
| [StrokeDashCap](../../aspose.page.xps.xpsmodel/xpspath/strokedashcap/) { get; set; } | Возвращает/устанавливает значение, определяющее способ рисования концов каждого тире. |
| [StrokeDashOffset](../../aspose.page.xps.xpsmodel/xpspath/strokedashoffset/) { get; set; } | Возвращает/устанавливает начальную точку для повторения шаблона массива штрихов. Если это значение опущено, массив штрихов выравнивается с исходной точкой штриха. |
| [StrokeEndLineCap](../../aspose.page.xps.xpsmodel/xpspath/strokeendlinecap/) { get; set; } | Возвращает/задает значение, определяющее форму конца последнего тире в штрихе. |
| [StrokeLineJoin](../../aspose.page.xps.xpsmodel/xpspath/strokelinejoin/) { get; set; } | Возвращает/задает значение, определяющее форму начала первого тире в штрихе. |
| [StrokeMiterLimit](../../aspose.page.xps.xpsmodel/xpspath/strokemiterlimit/) { get; set; } | Возвращает/устанавливает соотношение между максимальной длиной скоса и половиной толщины штриха. Это значение важно, только если`StrokeLineПрисоединиться` атрибут указывает`Митра` . |
| [StrokeStartLineCap](../../aspose.page.xps.xpsmodel/xpspath/strokestartlinecap/) { get; set; } | Возвращает/задает значение, определяющее форму начала первого тире в штрихе. |
| [StrokeThickness](../../aspose.page.xps.xpsmodel/xpspath/strokethickness/) { get; set; } | Возвращает/задает толщину обводки в единицах эффективного координатного пространства (включая преобразование рендеринга пути). Обводка рисуется поверх границы геометрии, указанной свойством Data элемента Path. Половина StrokeThickness простирается за пределы геометрии, заданной свойством Data, а другая половина простирается внутри геометрии. |

## Методы

| Имя | Описание |
| --- | --- |
| [Clone](../../aspose.page.xps.xpsmodel/xpspath/clone/)() | Клонирует этот путь. |
| [GetEnumerator](../../aspose.page.xps.xpsmodel/xpselement/getenumerator/)() | РеализацияIEnumerable интерфейс. |

### Смотрите также

* class [XpsContentElement](../xpscontentelement/)
* пространство имен [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* сборка [Aspose.Page](../../)


