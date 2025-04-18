---
title: lnk Ширина линии аннотации
linktitle: lnk Ширина линии аннотации
second_title: Aspose.PDF для справочника API .NET
description: В этой статье представлено пошаговое руководство по настройке ширины линии аннотации lnk с использованием Aspose.PDF для .NET.
type: docs
weight: 110
url: /ru/net/annotations/lnkannotationlinewidth/
---
Aspose.PDF — это мощный и широко используемый инструмент для работы с файлами PDF в приложениях .NET. Он предоставляет множество функций для создания, редактирования и управления PDF-файлами, включая возможность добавления аннотаций к страницам. В этом руководстве мы объясним, как установить ширину линии аннотации ссылки с помощью Aspose.PDF для .NET.

Если у вас есть эти предварительные условия, создайте новый проект консольного приложения в Visual Studio. Затем добавьте ссылку на библиотеку Aspose.PDF для .NET, щелкнув правой кнопкой мыши проект в обозревателе решений, выбрав «Управление пакетами NuGet» и выполнив поиск «Aspose.PDF» в диспетчере пакетов NuGet.

Чтобы добавить аннотацию lnk в документ PDF, выполните следующие действия:

##  Шаг 1: Создайте новый`Document` object.
```csharp
Document doc = new Document();
```
## Шаг 2: Добавьте новую страницу в документ.
```csharp
doc.Pages.Add();
```
##  Шаг 3: Создайте список`Point` arrays that represent the ink gesture for the annotation.
```csharp
IList<Point[]> inkList = new List<Point[]>();
```
##  Шаг 4: Создайте новый`LineInfo` object that defines the properties of the ink gesture.
```csharp
LineInfo lineInfo = new LineInfo();
lineInfo.VerticeCoordinate = new float[] { 55, 55, 70, 70, 70, 90, 150, 60 };
lineInfo.Visibility = true;
lineInfo.LineColor = System.Drawing.Color.Red;
lineInfo.LineWidth = 2;
```
##  Шаг 5: Создайте новый`Aspose.Pdf.Point` array that represents the gesture from the `LineInfo` object.
```csharp
int length = lineInfo.VerticeCoordinate.Length / 2;
Aspose.Pdf.Point[] gesture = new Aspose.Pdf.Point[length];
for (int i = 0; i < length; i++)
{
    gesture[i] = new Aspose.Pdf.Point(lineInfo.VerticeCoordinate[2 * i], lineInfo.VerticeCoordinate[2 * i + 1]);
}
```
## Шаг 6: Добавьте жест в список рукописных жестов.
```csharp
inkList.Add(gesture);
```
##  Шаг 7: Создайте новый`InkAnnotation` object that represents the link annotation.
```csharp
InkAnnotation a1 = new InkAnnotation(doc.Pages[1], new Aspose.Pdf.Rectangle(100, 100, 300, 300), inkList);
```
## Шаг 8: Установите тему и заголовок аннотации.
```csharp
a1.Subject = "Test";
a1.Title = "Title";
```
## Шаг 9: Установите цвет аннотации.
```csharp
a1.Color = Aspose.Pdf.Color.FromRgb(System.Drawing.Color.Green);
```
##  Шаг 10: Создайте новый`Border` object that defines the properties of the annotation's border.
```csharp
Border border = new Border(a1);
border.Width = 3;
border.Effect = BorderEffect.Cloudy;
border.Dash = new Dash(1, 1);
border.Style = BorderStyle.Solid;
```
## Шаг 11: Добавьте аннотацию на страницу.
```csharp
doc.Pages[1].Annotations.Add(a1);
```
## Шаг 12: Сохраните документ в файл.
```csharp
// Сохранить выходной файл
doc.Save(dataDir);


```
### В примере показана ширина строки аннотации lnk с Aspose.PDF для .NET.

```csharp
// Путь к каталогу документов.
string dataDir = "YOUR DOCUMENT DIRECTORY";

Document doc = new Document();
doc.Pages.Add();
IList<Point[]> inkList = new List<Point[]>();
LineInfo lineInfo = new LineInfo();
lineInfo.VerticeCoordinate = new float[] { 55, 55, 70, 70, 70, 90, 150, 60 };
lineInfo.Visibility = true;
lineInfo.LineColor = System.Drawing.Color.Red;
lineInfo.LineWidth = 2;
int length = lineInfo.VerticeCoordinate.Length / 2;
Aspose.Pdf.Point[] gesture = new Aspose.Pdf.Point[length];
for (int i = 0; i < length; i++)
{
gesture[i] = new Aspose.Pdf.Point(lineInfo.VerticeCoordinate[2 * i], lineInfo.VerticeCoordinate[2 * i + 1]);
}

inkList.Add(gesture);
InkAnnotation a1 = new InkAnnotation(doc.Pages[1], new Aspose.Pdf.Rectangle(100, 100, 300, 300), inkList);
a1.Subject = "Test";
a1.Title = "Title";
a1.Color = Aspose.Pdf.Color.FromRgb(System.Drawing.Color.Green);
Border border = new Border(a1);
border.Width = 3;
border.Effect = BorderEffect.Cloudy;
border.Dash = new Dash(1, 1);
border.Style = BorderStyle.Solid;
doc.Pages[1].Annotations.Add(a1);

dataDir = dataDir + "lnkAnnotationLineWidth_out.pdf";
// Сохранить выходной файл
doc.Save(dataDir);
```

## Заключение

В этом руководстве мы узнали, как установить ширину линии аннотации ссылки в документе PDF с помощью Aspose.PDF для .NET. Aspose.PDF для .NET предоставляет широкий спектр инструментов и функций для работы с PDF-документами, включая возможность создавать и настраивать аннотации ссылок. Следуя пошаговому руководству и используя предоставленный исходный код C#, разработчики могут легко добавлять интерактивные ссылки в свои документы PDF, улучшая взаимодействие с пользователем и интерактивность своих приложений. Aspose.PDF для .NET — это универсальная библиотека, которая позволяет разработчикам .NET эффективно и результативно работать с PDF-файлами.

### Часто задаваемые вопросы

#### В: Что такое аннотация ссылки в документе PDF?

О: Аннотация ссылки в документе PDF — это интерактивный элемент, который позволяет создавать гиперссылки или действия, направляющие пользователя в другое место в том же документе, на внешний веб-сайт или в другой документ PDF.

#### В: Как установить ширину линии аннотации ссылки с помощью Aspose.PDF для .NET?

О: Чтобы установить ширину линии аннотации ссылки с помощью Aspose.PDF для .NET, вы можете создать`InkAnnotation` объекта и укажите свойство ширины линии.

#### Вопрос: Какие свойства можно настроить для аннотации ссылки в Aspose.PDF для .NET?

О: Вы можете настроить различные свойства аннотации ссылки в Aspose.PDF для .NET, такие как ее расположение, размер, цвет, свойства границы (ширина, стиль, шаблон штриха и эффект), тема, заголовок и видимость.

#### Вопрос. Можно ли создать аннотацию ссылки, содержащую несколько жестов пера?

 О: Да, вы можете создать аннотацию ссылки, содержащую несколько жестов пера, добавив несколько`Point` массивы в`InkAnnotation` объект.

#### В: Как я могу добавить аннотацию ссылки на определенную страницу PDF-документа?

 О: Чтобы добавить аннотацию ссылки на конкретную страницу PDF-документа, необходимо указать номер страницы при создании`InkAnnotation` объект. Например,`new InkAnnotation(doc.Pages[1], ...)` добавляет аннотацию ссылки на первую страницу.