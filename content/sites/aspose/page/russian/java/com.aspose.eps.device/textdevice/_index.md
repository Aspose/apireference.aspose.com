---
title: "TextDevice"
second_title: "Справочник API Aspose.Page для Java"
description: 
type: docs
weight: 13
url: /ru/java/com.aspose.eps.device/textdevice/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.Device](../../com.aspose.page/device)

**All Implemented Interfaces:**
[com.aspose.page.IMultiPageDevice](../../com.aspose.page/imultipagedevice)
```
public class TextDevice extends Device implements IMultiPageDevice
```
## Конструкторы

| Конструктор | Описание |
| --- | --- |
| [TextDevice()](#TextDevice--) |  |
## Поля

| Поле | Описание |
| --- | --- |
| [DEFAULT_SIZE](#DEFAULT-SIZE) |  |
| [EMIT_ERRORS](#EMIT-ERRORS) |  |
| [EMIT_WARNINGS](#EMIT-WARNINGS) |  |
| [VERSION](#VERSION) | Текущая версия устройства. |
## Методы

| Метод | Описание |
| --- | --- |
| [closePage()](#closePage--) |  |
| [create()](#create--) |  |
| [dispose()](#dispose--) |  |
| [draw(Shape path)](#draw-java.awt.Shape-) | Рисует путь. |
| [drawArc(float x, float y, float width, float height, float startAngle, float arcAngle)](#drawArc-float-float-float-float-float-float-) | Рисует дугу. |
| [drawImage(BufferedImage image, AffineTransform transform, Color bkg)](#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-) | Рисует изображение с заданным преобразованием и фоном. |
| [drawLine(float x1, float y1, float x2, float y2)](#drawLine-float-float-float-float-) | Рисует отрезок линии. |
| [drawOval(float x, float y, float width, float height)](#drawOval-float-float-float-float-) | Рисует овал. |
| [drawPolygon(float[] xPoints, float[] yPoints, int nPoints)](#drawPolygon-float---float---int-) | Рисует многоугольник. |
| [drawPolygon(int[] xPoints, int[] yPoints, int nPoints)](#drawPolygon-int---int---int-) | Рисует многоугольник. |
| [drawPolyline(float[] xPoints, float[] yPoints, int nPoints)](#drawPolyline-float---float---int-) | Рисует полилинию. |
| [drawPolyline(int[] xPoints, int[] yPoints, int nPoints)](#drawPolyline-int---int---int-) | Рисует полилинию. |
| [drawRect(float x, float y, float width, float height)](#drawRect-float-float-float-float-) | Рисует прямоугольник. |
| [drawRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)](#drawRoundRect-float-float-float-float-float-float-) | Рисует скруглённый прямоугольник. |
| [drawString(String str, float x, float y)](#drawString-java.lang.String-float-float-) |  |
| [endDocument()](#endDocument--) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [fill(Shape path)](#fill-java.awt.Shape-) | Заполняет путь. |
| [fillArc(float x, float y, float width, float height, float startAngle, float arcAngle)](#fillArc-float-float-float-float-float-float-) | Заполняет дугу. |
| [fillOval(float x, float y, float width, float height)](#fillOval-float-float-float-float-) | Заполняет овал. |
| [fillPolygon(float[] xPoints, float[] yPoints, int nPoints)](#fillPolygon-float---float---int-) | Заполняет многоугольник. |
| [fillPolygon(int[] xPoints, int[] yPoints, int nPoints)](#fillPolygon-int---int---int-) | Заполняет многоугольник. |
| [fillRect(float x, float y, float width, float height)](#fillRect-float-float-float-float-) | Заполняет прямоугольник. |
| [fillRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)](#fillRoundRect-float-float-float-float-float-float-) | Рисует скруглённый прямоугольник. |
| [getBackground()](#getBackground--) | Получает текущий фон страницы. |
| [getCharTM()](#getCharTM--) | Получает текущую трансформацию символов. |
| [getClass()](#getClass--) |  |
| [getCreator()](#getCreator--) | Получает создателя результирующего вывода устройства. |
| [getCurrentPageNumber()](#getCurrentPageNumber--) |  |
| [getFont()](#getFont--) | Получает текущий шрифт. |
| [getOpacity()](#getOpacity--) | Получает текущую непрозрачность. |
| [getOpacityMask()](#getOpacityMask--) | Получает текущую маску непрозрачности. |
| [getPages()](#getPages--) |  |
| [getPaint()](#getPaint--) | Получает текущую заливку. |
| [getProperties()](#getProperties--) | Получает свойства устройства, включая метаданные. |
| [getProperty(String key)](#getProperty-java.lang.String-) | Получает значение строкового свойства. |
| [getPropertyColor(String key)](#getPropertyColor-java.lang.String-) | Получает значение свойства цвета. |
| [getPropertyDouble(String key)](#getPropertyDouble-java.lang.String-) | Получает значение свойства типа double. |
| [getPropertyInt(String key)](#getPropertyInt-java.lang.String-) | Получает значение свойства типа integer. |
| [getPropertyMargins(String key)](#getPropertyMargins-java.lang.String-) | Получает значение свойства отступов. |
| [getPropertyMatrix(String key)](#getPropertyMatrix-java.lang.String-) | Получает значение свойства матрицы. |
| [getPropertyRectangle(String key)](#getPropertyRectangle-java.lang.String-) | Получает значение свойства прямоугольника. |
| [getPropertySize(String key)](#getPropertySize-java.lang.String-) | Получает значение свойства размера. |
| [getSaveOptions()](#getSaveOptions--) | Возвращает параметры сохранения. |
| [getSize()](#getSize--) | Получает размер страницы. |
| [getStroke()](#getStroke--) | Получает текущий штрих. |
| [getText()](#getText--) |  |
| [getText(int startPage, int endPage)](#getText-int-int-) |  |
| [getTextRenderingMode()](#getTextRenderingMode--) | Получает текущий режим отображения текста. |
| [getTextStrokeWidth()](#getTextStrokeWidth--) | Получает текущую ширину штриха текста. |
| [getTransform()](#getTransform--) | Получает текущую трансформацию. |
| [hashCode()](#hashCode--) |  |
| [initClip()](#initClip--) | Инициализирует обрезку устройства. |
| [initPageNumbers()](#initPageNumbers--) |  |
| [isDirectRGB()](#isDirectRGB--) |  |
| [isMainDocument()](#isMainDocument--) |  |
| [isProperty(String key)](#isProperty-java.lang.String-) | Получает значение булевого свойства. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [openPage(float width, float height)](#openPage-float-float-) |  |
| [openPage(String title)](#openPage-java.lang.String-) |  |
| [renew()](#renew--) |  |
| [renewForMerge(boolean mainDocument)](#renewForMerge-boolean-) |  |
| [reset()](#reset--) |  |
| [reset(boolean zeroPageNumbers)](#reset-boolean-) |  |
| [rotate(double theta)](#rotate-double-) | Поворачивает текущую матрицу преобразования. |
| [rotate(double theta, double x, double y)](#rotate-double-double-double-) | Поворачивает текущую матрицу преобразования вокруг точки. |
| [scale(double x, double y)](#scale-double-double-) | Масштабирует текущую матрицу преобразования. |
| [setBackground(Color background)](#setBackground-java.awt.Color-) | Указывает текущий фон страницы. |
| [setCharTM(AffineTransform charTM)](#setCharTM-java.awt.geom.AffineTransform-) | Указывает преобразование символов. |
| [setClip(Shape clipPath)](#setClip-java.awt.Shape-) | Указывает обрезку устройства. |
| [setCreator(String creator)](#setCreator-java.lang.String-) | Указывает создателя результирующего вывода устройства. |
| [setFont(ITrFont font)](#setFont-com.aspose.page.ITrFont-) | Указывает шрифт. |
| [setOpacity(float opacity)](#setOpacity-float-) | Указывает непрозрачность. |
| [setOpacityMask(Paint opacityMask)](#setOpacityMask-java.awt.Paint-) | Указывает маску непрозрачности. |
| [setPaint(Paint paint)](#setPaint-java.awt.Paint-) | Указывает заливку. |
| [setProperties(UserProperties props)](#setProperties-com.aspose.page.UserProperties-) | Указывает свойства устройства, включая метаданные. |
| [setSaveOptions(SaveOptions options)](#setSaveOptions-com.aspose.page.SaveOptions-) | Указывает параметры управления процессом рендеринга. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) |  |
| [setStroke(Stroke stroke)](#setStroke-java.awt.Stroke-) | Указывает штрих. |
| [setTextRenderingMode(TextRenderingMode textRenderingMode)](#setTextRenderingMode-com.aspose.page.TextRenderingMode-) | Указывает режим отображения текста. |
| [setTextStrokeWidth(float textStrokeWidth)](#setTextStrokeWidth-float-) | Указывает ширину штриха текста. |
| [setTransform(AffineTransform transform)](#setTransform-java.awt.geom.AffineTransform-) | Указывает текущую трансформацию. |
| [shear(double shx, double shy)](#shear-double-double-) | Применяет сдвиг к текущей матрице преобразования. |
| [startDocument()](#startDocument--) |  |
| [toString()](#toString--) |  |
| [transform(AffineTransform transform)](#transform-java.awt.geom.AffineTransform-) | Преобразует текущую матрицу преобразования. |
| [translate(double x, double y)](#translate-double-double-) | Смещает текущую матрицу преобразования. |
| [updatePageParameters(IMultiPageDevice device)](#updatePageParameters-com.aspose.page.IMultiPageDevice-) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
| [writeComment(String comment)](#writeComment-java.lang.String-) | Записывает комментарий. |
| [writeString(ITrFont font, String str)](#writeString-com.aspose.page.ITrFont-java.lang.String-) | Выводит строку с указанным шрифтом. |
| [writeWarning(String warning)](#writeWarning-java.lang.String-) |  |
### TextDevice() {#TextDevice--}
```
public TextDevice()
```


### DEFAULT_SIZE {#DEFAULT-SIZE}
```
public static final Dimension DEFAULT_SIZE
```


### EMIT_ERRORS {#EMIT-ERRORS}
```
public static final String EMIT_ERRORS
```


### EMIT_WARNINGS {#EMIT-WARNINGS}
```
public static final String EMIT_WARNINGS
```


### VERSION {#VERSION}
```
public static String VERSION
```


Текущая версия устройства.

### closePage() {#closePage--}
```
public void closePage()
```


Выполняет необходимую подготовку устройства после отрисовки страницы.

### create() {#create--}
```
public Device create()
```


Создаёт копию этого устройства.

**Returns:**
[Device](../../com.aspose.page/device)
### dispose() {#dispose--}
```
public void dispose()
```


Освобождает устройство.

### draw(Shape path) {#draw-java.awt.Shape-}
```
public void draw(Shape path)
```


Рисует путь.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| path | java.awt.Shape | Контур для отрисовки. |

### drawArc(float x, float y, float width, float height, float startAngle, float arcAngle) {#drawArc-float-float-float-float-float-float-}
```
public void drawArc(float x, float y, float width, float height, float startAngle, float arcAngle)
```


Рисует дугу.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| x | float | X-координата центра дуги. |
| y | float | Y-координата центра дуги. |
| ширина | float | Ширина описанного прямоугольника. |
| высота | float | Высота описанного прямоугольника. |
| startAngle | float | Начальный угол дуги. |
| arcAngle | float | Угол дуги. |

### drawImage(BufferedImage image, AffineTransform transform, Color bkg) {#drawImage-java.awt.image.BufferedImage-java.awt.geom.AffineTransform-java.awt.Color-}
```
public void drawImage(BufferedImage image, AffineTransform transform, Color bkg)
```


Рисует изображение с заданным преобразованием и фоном.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| image | java.awt.image.BufferedImage | Изображение для отрисовки. |
| transform | java.awt.geom.AffineTransform | Преобразование. |
| bkg | java.awt.Color | Цвет фона. |

### drawLine(float x1, float y1, float x2, float y2) {#drawLine-float-float-float-float-}
```
public void drawLine(float x1, float y1, float x2, float y2)
```


Рисует отрезок линии.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| x1 | float | X-координата начала сегмента. |
| y1 | float | Y-координата начала сегмента. |
| x2 | float | X-координата конца сегмента. |
| y2 | float | Y-координата конца сегмента. |

### drawOval(float x, float y, float width, float height) {#drawOval-float-float-float-float-}
```
public void drawOval(float x, float y, float width, float height)
```


Рисует овал.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| x | float | X-координата центра овала. |
| y | float | Y‑координата центра овала. |
| ширина | float | Ширина описанного прямоугольника. |
| высота | float | Высота описанного прямоугольника. |

### drawPolygon(float[] xPoints, float[] yPoints, int nPoints) {#drawPolygon-float---float---int-}
```
public void drawPolygon(float[] xPoints, float[] yPoints, int nPoints)
```


Рисует многоугольник.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| xPoints | float[] | X‑координаты точек. |
| yPoints | float[] | Y‑координата точек. |
| nPoints | int | Количество точек. |

### drawPolygon(int[] xPoints, int[] yPoints, int nPoints) {#drawPolygon-int---int---int-}
```
public void drawPolygon(int[] xPoints, int[] yPoints, int nPoints)
```


Рисует многоугольник.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| xPoints | int[] | X‑координаты точек. |
| yPoints | int[] | Y‑координата точек. |
| nPoints | int | Количество точек. |

### drawPolyline(float[] xPoints, float[] yPoints, int nPoints) {#drawPolyline-float---float---int-}
```
public void drawPolyline(float[] xPoints, float[] yPoints, int nPoints)
```


Рисует полилинию.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| xPoints | float[] | X‑координаты точек. |
| yPoints | float[] | Y‑координата точек. |
| nPoints | int | Количество точек. |

### drawPolyline(int[] xPoints, int[] yPoints, int nPoints) {#drawPolyline-int---int---int-}
```
public void drawPolyline(int[] xPoints, int[] yPoints, int nPoints)
```


Рисует полилинию.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| xPoints | int[] | X‑координаты точек. |
| yPoints | int[] | Y‑координата точек. |
| nPoints | int | Количество точек. |

### drawRect(float x, float y, float width, float height) {#drawRect-float-float-float-float-}
```
public void drawRect(float x, float y, float width, float height)
```


Рисует прямоугольник.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| x | float | X‑координата верхнего левого угла прямоугольника. |
| y | float | Y‑координата верхнего левого угла прямоугольника. |
| ширина | float | Ширина прямоугольника. |
| высота | float | Высота прямоугольника. |

### drawRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight) {#drawRoundRect-float-float-float-float-float-float-}
```
public void drawRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)
```


Рисует скруглённый прямоугольник.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| x | float | X‑координата верхнего левого угла прямоугольника. |
| y | float | Y‑координата верхнего левого угла прямоугольника. |
| ширина | float | Ширина прямоугольника. |
| высота | float | Высота прямоугольника. |
| arcWidth | float | Ширина описанного прямоугольника дуги, скругляющего угол прямоугольника. |
| arcHeight | float | Высота описанного прямоугольника дуги, скругляющего угол прямоугольника. |

### drawString(String str, float x, float y) {#drawString-java.lang.String-float-float-}
```
public void drawString(String str, float x, float y)
```


Рисует строку в заданной точке.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| str | java.lang.String |  |
| x | float |  |
| y | float |  |

### endDocument() {#endDocument--}
```
public void endDocument()
```


Выполняет необходимую подготовку устройства после рендеринга документа.

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### fill(Shape path) {#fill-java.awt.Shape-}
```
public void fill(Shape path)
```


Заполняет путь.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| path | java.awt.Shape | Путь для заполнения. |

### fillArc(float x, float y, float width, float height, float startAngle, float arcAngle) {#fillArc-float-float-float-float-float-float-}
```
public void fillArc(float x, float y, float width, float height, float startAngle, float arcAngle)
```


Заполняет дугу.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| x | float | X-координата центра дуги. |
| y | float | Y-координата центра дуги. |
| ширина | float | Ширина описанного прямоугольника. |
| высота | float | Высота описанного прямоугольника. |
| startAngle | float | Начальный угол дуги. |
| arcAngle | float | Угол дуги. |

### fillOval(float x, float y, float width, float height) {#fillOval-float-float-float-float-}
```
public void fillOval(float x, float y, float width, float height)
```


Заполняет овал.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| x | float | X-координата центра овала. |
| y | float | Y‑координата центра овала. |
| ширина | float | Ширина описанного прямоугольника. |
| высота | float | Высота описанного прямоугольника. |

### fillPolygon(float[] xPoints, float[] yPoints, int nPoints) {#fillPolygon-float---float---int-}
```
public void fillPolygon(float[] xPoints, float[] yPoints, int nPoints)
```


Заполняет многоугольник.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| xPoints | float[] | X‑координаты точек. |
| yPoints | float[] | Y‑координата точек. |
| nPoints | int | Количество точек. |

### fillPolygon(int[] xPoints, int[] yPoints, int nPoints) {#fillPolygon-int---int---int-}
```
public void fillPolygon(int[] xPoints, int[] yPoints, int nPoints)
```


Заполняет многоугольник.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| xPoints | int[] | X‑координаты точек. |
| yPoints | int[] | Y‑координата точек. |
| nPoints | int | Количество точек. |

### fillRect(float x, float y, float width, float height) {#fillRect-float-float-float-float-}
```
public void fillRect(float x, float y, float width, float height)
```


Заполняет прямоугольник.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| x | float | X‑координата верхнего левого угла прямоугольника. |
| y | float | Y‑координата верхнего левого угла прямоугольника. |
| ширина | float | Ширина прямоугольника. |
| высота | float | Высота прямоугольника. |

### fillRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight) {#fillRoundRect-float-float-float-float-float-float-}
```
public void fillRoundRect(float x, float y, float width, float height, float arcWidth, float arcHeight)
```


Рисует скруглённый прямоугольник.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| x | float | X‑координата верхнего левого угла прямоугольника. |
| y | float | Y‑координата верхнего левого угла прямоугольника. |
| ширина | float | Ширина прямоугольника. |
| высота | float | Высота прямоугольника. |
| arcWidth | float | Ширина описанного прямоугольника дуги, скругляющего угол прямоугольника. |
| arcHeight | float | Высота описанного прямоугольника дуги, скругляющего угол прямоугольника. |

### getBackground() {#getBackground--}
```
public Color getBackground()
```


Получает текущий фон страницы.

**Returns:**
java.awt.Color — текущий фон страницы
### getCharTM() {#getCharTM--}
```
public AffineTransform getCharTM()
```


Получает текущую трансформацию символов.

**Returns:**
java.awt.geom.AffineTransform — текущая трансформация символов.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getCreator() {#getCreator--}
```
public String getCreator()
```


Получает создателя результирующего вывода устройства.

**Returns:**
java.lang.String — значение создателя.
### getCurrentPageNumber() {#getCurrentPageNumber--}
```
public int getCurrentPageNumber()
```


Получает текущий номер страницы.

**Returns:**
int
### getFont() {#getFont--}
```
public ITrFont getFont()
```


Получает текущий шрифт.

**Returns:**
[ITrFont](../../com.aspose.page/itrfont) - Current font.
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


Получает текущую непрозрачность.

**Returns:**
float — текущая непрозрачность.
### getOpacityMask() {#getOpacityMask--}
```
public Paint getOpacityMask()
```


Получает текущую маску непрозрачности.

**Returns:**
java.awt.Paint — текущая маска непрозрачности.
### getPages() {#getPages--}
```
public List<String> getPages()
```




**Returns:**
java.util.List<java.lang.String>
### getPaint() {#getPaint--}
```
public Paint getPaint()
```


Получает текущую заливку.

**Returns:**
java.awt.Paint - Текущая заливка.
### getProperties() {#getProperties--}
```
public UserProperties getProperties()
```


Получает свойства устройства, включая метаданные.

**Returns:**
[UserProperties](../../com.aspose.page/userproperties) - Device properties.
### getProperty(String key) {#getProperty-java.lang.String-}
```
public String getProperty(String key)
```


Получает значение строкового свойства.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| key | java.lang.String | Имя свойства. |

**Returns:**
java.lang.String - Значение свойства.
### getPropertyColor(String key) {#getPropertyColor-java.lang.String-}
```
public Color getPropertyColor(String key)
```


Получает значение свойства цвета.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| key | java.lang.String | Имя свойства. |

**Returns:**
java.awt.Color - Значение свойства.
### getPropertyDouble(String key) {#getPropertyDouble-java.lang.String-}
```
public double getPropertyDouble(String key)
```


Получает значение свойства типа double.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| key | java.lang.String | Имя свойства. |

**Returns:**
double - Значение свойства.
### getPropertyInt(String key) {#getPropertyInt-java.lang.String-}
```
public int getPropertyInt(String key)
```


Получает значение свойства типа integer.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| key | java.lang.String | Имя свойства. |

**Returns:**
int - Значение свойства.
### getPropertyMargins(String key) {#getPropertyMargins-java.lang.String-}
```
public Insets getPropertyMargins(String key)
```


Получает значение свойства отступов.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| key | java.lang.String | Имя свойства. |

**Returns:**
java.awt.Insets - Значение свойства.
### getPropertyMatrix(String key) {#getPropertyMatrix-java.lang.String-}
```
public AffineTransform getPropertyMatrix(String key)
```


Получает значение свойства матрицы.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| key | java.lang.String | Имя свойства. |

**Returns:**
java.awt.geom.AffineTransform - Значение свойства.
### getPropertyRectangle(String key) {#getPropertyRectangle-java.lang.String-}
```
public Rectangle getPropertyRectangle(String key)
```


Получает значение свойства прямоугольника.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| key | java.lang.String | Имя свойства. |

**Returns:**
java.awt.Rectangle - Значение свойства.
### getPropertySize(String key) {#getPropertySize-java.lang.String-}
```
public Dimension getPropertySize(String key)
```


Получает значение свойства размера.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| key | java.lang.String | Имя свойства. |

**Returns:**
java.awt.Dimension - Значение свойства.
### getSaveOptions() {#getSaveOptions--}
```
public SaveOptions getSaveOptions()
```


Возвращает параметры сохранения.

**Returns:**
[SaveOptions](../../com.aspose.page/saveoptions) - The save options.
### getSize() {#getSize--}
```
public Dimension getSize()
```


Получает размер страницы.

**Returns:**
java.awt.Dimension - Размер страницы.
### getStroke() {#getStroke--}
```
public Stroke getStroke()
```


Получает текущий штрих.

**Returns:**
java.awt.Stroke — текущий штрих.
### getText() {#getText--}
```
public String getText()
```




**Returns:**
java.lang.String
### getText(int startPage, int endPage) {#getText-int-int-}
```
public String getText(int startPage, int endPage)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| startPage | int |  |
| endPage | int |  |

**Returns:**
java.lang.String
### getTextRenderingMode() {#getTextRenderingMode--}
```
public TextRenderingMode getTextRenderingMode()
```


Получает текущий режим отображения текста.

**Returns:**
[TextRenderingMode](../../com.aspose.page/textrenderingmode) - Current text rendering mode.
### getTextStrokeWidth() {#getTextStrokeWidth--}
```
public float getTextStrokeWidth()
```


Получает текущую ширину штриха текста.

**Returns:**
float - Текущая ширина штриха текста.
### getTransform() {#getTransform--}
```
public AffineTransform getTransform()
```


Получает текущую трансформацию.

**Returns:**
java.awt.geom.AffineTransform - Текущее преобразование.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### initClip() {#initClip--}
```
public void initClip()
```


Инициализирует обрезку устройства.

### initPageNumbers() {#initPageNumbers--}
```
public void initPageNumbers()
```


Инициализирует количество страниц для рендеринга.

### isDirectRGB() {#isDirectRGB--}
```
public boolean isDirectRGB()
```


Указывает, использует ли устройство прямой режим RGB, то есть RGB.

**Returns:**
boolean
### isMainDocument() {#isMainDocument--}
```
public boolean isMainDocument()
```




**Returns:**
boolean
### isProperty(String key) {#isProperty-java.lang.String-}
```
public boolean isProperty(String key)
```


Получает значение булевого свойства.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| key | java.lang.String | Имя свойства. |

**Returns:**
boolean - Значение свойства.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### openPage(float width, float height) {#openPage-float-float-}
```
public boolean openPage(float width, float height)
```


Выполняет необходимую подготовку устройства перед рендерингом страницы.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| ширина | float |  |
| высота | float |  |

**Returns:**
boolean
### openPage(String title) {#openPage-java.lang.String-}
```
public boolean openPage(String title)
```


Выполняет необходимую подготовку устройства перед рендерингом страницы.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| заголовок | java.lang.String |  |

**Returns:**
boolean
### renew() {#renew--}
```
public void renew()
```


Сбросить устройство в исходное состояние для всего документа. Используется для сброса выходного потока.

### renewForMerge(boolean mainDocument) {#renewForMerge-boolean-}
```
public void renewForMerge(boolean mainDocument)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| mainDocument | boolean |  |

### reset() {#reset--}
```
public void reset()
```


Сбросить устройство в исходное состояние для страницы.

### reset(boolean zeroPageNumbers) {#reset-boolean-}
```
public void reset(boolean zeroPageNumbers)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| zeroPageNumbers | boolean |  |

### rotate(double theta) {#rotate-double-}
```
public void rotate(double theta)
```


Повернуть текущую матрицу преобразования. Вызывает writeTransform(Transform). Поворот с положительным углом theta вращает точки на положительной оси x в сторону положительной оси y.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| theta | double | Угол в радианах, на который нужно повернуть. |

### rotate(double theta, double x, double y) {#rotate-double-double-double-}
```
public void rotate(double theta, double x, double y)
```


Поворачивает текущую матрицу преобразования вокруг точки.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| theta | double | Угол вращения в радианах. |
| x | double | X‑координата точки. |
| y | double | Y‑координата точки. |

### scale(double x, double y) {#scale-double-double-}
```
public void scale(double x, double y)
```


Масштабирует текущую матрицу преобразования. Вызывает writeTransform(Transform).

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| x | double | Масштаб по оси X. |
| y | double | Масштаб по оси Y. |

### setBackground(Color background) {#setBackground-java.awt.Color-}
```
public void setBackground(Color background)
```


Указывает текущий фон страницы.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| фон | java.awt.Color | Фон страницы. |

### setCharTM(AffineTransform charTM) {#setCharTM-java.awt.geom.AffineTransform-}
```
public void setCharTM(AffineTransform charTM)
```


Указывает преобразование символов.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| charTM | java.awt.geom.AffineTransform | \\u0421трансформация символов. |

### setClip(Shape clipPath) {#setClip-java.awt.Shape-}
```
public void setClip(Shape clipPath)
```


Указывает обрезку устройства.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| clipPath | java.awt.Shape | Клип‑путь. |

### setCreator(String creator) {#setCreator-java.lang.String-}
```
public void setCreator(String creator)
```


Указывает создателя результирующего вывода устройства.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| создатель | java.lang.String | Значение создателя. |

### setFont(ITrFont font) {#setFont-com.aspose.page.ITrFont-}
```
public void setFont(ITrFont font)
```


Указывает шрифт.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| font | [ITrFont](../../com.aspose.page/itrfont) | Шрифт. |

### setOpacity(float opacity) {#setOpacity-float-}
```
public void setOpacity(float opacity)
```


Указывает непрозрачность.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| непрозрачность | float | Непрозрачность. |

### setOpacityMask(Paint opacityMask) {#setOpacityMask-java.awt.Paint-}
```
public void setOpacityMask(Paint opacityMask)
```


Указывает маску непрозрачности.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| opacityMask | java.awt.Paint | Маска непрозрачности. |

### setPaint(Paint paint) {#setPaint-java.awt.Paint-}
```
public void setPaint(Paint paint)
```


Указывает заливку.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| paint | java.awt.Paint | Краска. |

### setProperties(UserProperties props) {#setProperties-com.aspose.page.UserProperties-}
```
public void setProperties(UserProperties props)
```


Указывает свойства устройства, включая метаданные.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| props | [UserProperties](../../com.aspose.page/userproperties) | Свойства устройства. |

### setSaveOptions(SaveOptions options) {#setSaveOptions-com.aspose.page.SaveOptions-}
```
public void setSaveOptions(SaveOptions options)
```


Указывает параметры управления процессом рендеринга.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| options | [SaveOptions](../../com.aspose.page/saveoptions) | Параметры управления процессом рендеринга. |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Указывает размер страницы.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| размер | java.awt.Dimension |  |

### setStroke(Stroke stroke) {#setStroke-java.awt.Stroke-}
```
public void setStroke(Stroke stroke)
```


Указывает штрих.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| stroke | java.awt.Stroke | Обводка. |

### setTextRenderingMode(TextRenderingMode textRenderingMode) {#setTextRenderingMode-com.aspose.page.TextRenderingMode-}
```
public void setTextRenderingMode(TextRenderingMode textRenderingMode)
```


Указывает режим отображения текста.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| textRenderingMode | [TextRenderingMode](../../com.aspose.page/textrenderingmode) | Режим отображения текста. |

### setTextStrokeWidth(float textStrokeWidth) {#setTextStrokeWidth-float-}
```
public void setTextStrokeWidth(float textStrokeWidth)
```


Указывает ширину штриха текста.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| textStrokeWidth | float | Ширина обводки текста. |

### setTransform(AffineTransform transform) {#setTransform-java.awt.geom.AffineTransform-}
```
public void setTransform(AffineTransform transform)
```


Указывает текущую трансформацию.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| transform | java.awt.geom.AffineTransform | Трансформация.. |

### shear(double shx, double shy) {#shear-double-double-}
```
public void shear(double shx, double shy)
```


Скосит текущую матрицу преобразования. Вызывает writeTransform(Transform).

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| shx | double | Скос по оси X. |
| shy | double | Скос по оси Y. |

### startDocument() {#startDocument--}
```
public void startDocument()
```


Выполняет необходимую подготовку устройства перед началом рендеринга документа.

### toString() {#toString--}
```
public String toString()
```


Возвращает название типа устройства.

**Returns:**
java.lang.String
### transform(AffineTransform transform) {#transform-java.awt.geom.AffineTransform-}
```
public void transform(AffineTransform transform)
```


Преобразует текущую матрицу преобразования. Вызывает writeTransform(Transform).

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| transform | java.awt.geom.AffineTransform | Преобразование, которое будет применено. |

### translate(double x, double y) {#translate-double-double-}
```
public void translate(double x, double y)
```


Перемещает текущую матрицу преобразования. Вызывает writeTransform(Transform).

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| x | double | Перемещение по оси X. |
| y | double | Перемещение по оси Y. |

### updatePageParameters(IMultiPageDevice device) {#updatePageParameters-com.aspose.page.IMultiPageDevice-}
```
public void updatePageParameters(IMultiPageDevice device)
```


Обновляет параметры страницы из другого многостраничного устройства.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| device | [IMultiPageDevice](../../com.aspose.page/imultipagedevice) |  |

### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

### writeComment(String comment) {#writeComment-java.lang.String-}
```
public void writeComment(String comment)
```


Записывает комментарий.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| комментарий | java.lang.String | Комментарий для записи. |

### writeString(ITrFont font, String str) {#writeString-com.aspose.page.ITrFont-java.lang.String-}
```
public void writeString(ITrFont font, String str)
```


Выводит строку с указанным шрифтом.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| font | [ITrFont](../../com.aspose.page/itrfont) | Указанный шрифт. |
| str | java.lang.String | Строка. |

### writeWarning(String warning) {#writeWarning-java.lang.String-}
```
public void writeWarning(String warning)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| предупреждение | java.lang.String |  |

