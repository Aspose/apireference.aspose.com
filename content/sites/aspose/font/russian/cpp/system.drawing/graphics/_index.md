---
title: "System::Drawing::Graphics class"
linktitle: "Graphics"
second_title: "Aspose.Font для C++"
description: "System::Drawing::Graphics class. Представляет поверхность рисования. Объекты этого класса должны выделяться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 1000
url: /ru/cpp/system.drawing/graphics/
---
## Graphics class


Представляет поверхность рисования. Объекты этого класса должны выделяться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class Graphics : public virtual System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| [AddMetafileComment](./addmetafilecomment/)(const System::ArrayPtr\<uint8_t\>\&) | НЕ РЕАЛИЗОВАНО. |
| [BeginContainer](./begincontainer/)() | Сохраняет контейнер с текущим состоянием этого объекта, открывает и использует новый контейнер и возвращает сохранённый контейнер. |
| [BeginContainer](./begincontainer/)(Rectangle, Rectangle, GraphicsUnit) | Сохраняет контейнер с текущим состоянием этого объекта, открывает и использует новый контейнер и возвращает сохранённый контейнер. |
| [BeginContainer](./begincontainer/)(RectangleF, RectangleF, GraphicsUnit) | Сохраняет контейнер с текущим состоянием этого объекта, открывает и использует новый контейнер и возвращает сохранённый контейнер. |
| [Clear](./clear/)(Color) | Очищает поверхность рисования, представленную текущим объектом, и заполняет её указанным цветом. |
| [CopyFromScreen](./copyfromscreen/)(Point, Point, Size, CopyPixelOperation) | НЕ РЕАЛИЗОВАНО. |
| [CopyFromScreen](./copyfromscreen/)(int32_t, int32_t, int32_t, int32_t, Size, CopyPixelOperation) | НЕ РЕАЛИЗОВАНО. |
| [Dispose](./dispose/)() | Освобождает все ресурсы операционной системы, захваченные текущим объектом. |
| [DrawArc](./drawarc/)(const SharedPtr\<Pen\>\&, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t) | Рисует указанную дугу, используя указанное перо, на поверхности, представленной текущим объектом. |
| [DrawArc](./drawarc/)(const SharedPtr\<Pen\>\&, float, float, float, float, float, float) | Рисует указанную дугу, используя указанное перо, на поверхности, представленной текущим объектом. |
| [DrawArc](./drawarc/)(const SharedPtr\<Pen\>\&, Rectangle, float, float) | Рисует указанную дугу, используя указанное перо, на поверхности, представленной текущим объектом. |
| [DrawArc](./drawarc/)(const SharedPtr\<Pen\>\&, RectangleF, float, float) | Рисует указанную дугу, используя указанное перо, на поверхности, представленной текущим объектом. |
| [DrawBezier](./drawbezier/)(const SharedPtr\<Pen\>\&, const Point\&, const Point\&, const Point\&, const Point\&) | НЕ РЕАЛИЗОВАНО. |
| [DrawBezier](./drawbezier/)(const SharedPtr\<Pen\>\&, const PointF\&, const PointF\&, const PointF\&, const PointF\&) | НЕ РЕАЛИЗОВАНО. |
| [DrawBezier](./drawbezier/)(const SharedPtr\<Pen\>\&, float, float, float, float, float, float, float, float) | НЕ РЕАЛИЗОВАНО. |
| [DrawBeziers](./drawbeziers/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&) | Рисует серию сплайнов Безье, используя указанное перо. |
| [DrawBeziers](./drawbeziers/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&) | Рисует серию сплайнов Безье, используя указанное перо. |
| [DrawClosedCurve](./drawclosedcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&, float, Drawing2D::FillMode) | Рисует замкнутый сплайн, используя указанное перо. |
| [DrawClosedCurve](./drawclosedcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&, float, Drawing2D::FillMode) | Рисует замкнутый сплайн, используя указанное перо. |
| [DrawCurve](./drawcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&, float) | Рисует сплайн, используя указанное перо. |
| [DrawCurve](./drawcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&, float) | Рисует сплайн, используя указанное перо. |
| [DrawCurve](./drawcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&, int32_t, int32_t, float) | Рисует сплайн, используя указанное перо. |
| [DrawCurve](./drawcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&, int32_t, int32_t, float) | Рисует сплайн, используя указанное перо. |
| [DrawEllipse](./drawellipse/)(const SharedPtr\<Pen\>\&, Rectangle) | Рисует указанный эллипс, используя указанное перо, на поверхности, представленной текущим объектом. |
| [DrawEllipse](./drawellipse/)(const SharedPtr\<Pen\>\&, RectangleF) | Рисует указанный эллипс, используя указанное перо, на поверхности, представленной текущим объектом. |
| [DrawEllipse](./drawellipse/)(const SharedPtr\<Pen\>\&, int, int, int, int) | Рисует указанный эллипс, используя указанное перо, на поверхности, представленной текущим объектом. |
| [DrawEllipse](./drawellipse/)(const SharedPtr\<Pen\>\&, float, float, float, float) | Рисует указанный эллипс, используя указанное перо, на поверхности, представленной текущим объектом. |
| [DrawIcon](./drawicon/)(const SharedPtr\<Icon\>\&, Rectangle) | НЕ РЕАЛИЗОВАНО. |
| [DrawIcon](./drawicon/)(const SharedPtr\<Icon\>\&, int32_t, int32_t) | НЕ РЕАЛИЗОВАНО. |
| [DrawIconUnstretched](./drawiconunstretched/)(const SharedPtr\<Icon\>\&, Rectangle) | НЕ РЕАЛИЗОВАНО. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const System::ArrayPtr\<Point\>\&) | НЕ РЕАЛИЗОВАНО. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const System::ArrayPtr\<PointF\>\&, const RectangleF\&, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | Рисует указанную область указанного изображения в указанном месте. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const System::Details::ArrayView\<PointF\>\&, const RectangleF\&, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | Рисует указанную область указанного изображения в указанном месте. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const System::Details::StackArray\<PointF, N\>\&, const RectangleF\&, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | Рисует указанную область указанного изображения в указанном месте. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, int, int) | Рисует указанное изображение в указанном месте. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, float, float) | Рисует указанное изображение в указанном месте. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Point) | Рисует указанное изображение в указанном месте. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, PointF) | Рисует указанное изображение в указанном месте. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, int, int, int, int) | Рисует указанное изображение в указанный прямоугольник. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, float, float, float, float) | Рисует указанное изображение в указанный прямоугольник. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, RectangleF, RectangleF, GraphicsUnit) | Рисует указанную область указанного изображения в указанном месте. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, Rectangle, GraphicsUnit) | Рисует указанную область указанного изображения в указанном месте. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, int, int, Rectangle, GraphicsUnit) | Рисует указанную область указанного изображения в указанном месте. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const Rectangle\&) | Рисует указанное изображение в указанном месте. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const RectangleF\&) | Рисует указанное изображение в указанном месте. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, int, int, int, int, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | Рисует указанную область указанного изображения в указанный прямоугольник. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, float, float, float, float, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | Рисует указанную область указанного изображения в указанный прямоугольник. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, int, int, int, int, GraphicsUnit) | Рисует указанную область указанного изображения в указанный прямоугольник. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, float, float, float, float, GraphicsUnit) | Рисует указанную область указанного изображения в указанный прямоугольник. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, int, int, int, int, GraphicsUnit, const Imaging::ImageAttributesPtr\&, Graphics::DrawImageAbort) | НЕ РЕАЛИЗОВАНО. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, float, float, float, float, GraphicsUnit, const Imaging::ImageAttributesPtr\&, Graphics::DrawImageAbort) | НЕ РЕАЛИЗОВАНО. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, int, int, int, int, GraphicsUnit, const Imaging::ImageAttributesPtr\&, Graphics::DrawImageAbort, IntPtr) | НЕ РЕАЛИЗОВАНО. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, float, float, float, float, GraphicsUnit, const Imaging::ImageAttributesPtr\&, Graphics::DrawImageAbort, IntPtr) | НЕ РЕАЛИЗОВАНО. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const ArrayPtr\<PointF\>\&, RectangleF, GraphicsUnit) | НЕ РЕАЛИЗОВАНО. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const ArrayPtr\<PointF\>\&) | НЕ РЕАЛИЗОВАНО. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const ArrayPtr\<Point\>\&, Rectangle, GraphicsUnit) | НЕ РЕАЛИЗОВАНО. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const ArrayPtr\<Point\>\&, Rectangle, GraphicsUnit, const SharedPtr\<Imaging::ImageAttributes\>\&) | Рисует указанную область указанного изображения в указанном месте. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, float, float, RectangleF, GraphicsUnit) | Рисует указанную область указанного изображения в указанном месте. |
| [DrawImageUnscaled](./drawimageunscaled/)(const SharedPtr\<Image\>\&, int, int) | Рисует указанное изображение, используя его оригинальный физический размер, в указанном месте. |
| [DrawImageUnscaled](./drawimageunscaled/)(const SharedPtr\<Image\>\&, int, int, int, int) | Рисует указанное изображение, используя его оригинальный физический размер, в указанном месте. |
| [DrawImageUnscaled](./drawimageunscaled/)(const SharedPtr\<Image\>\&, const Rectangle\&) | Рисует указанное изображение, используя его оригинальный физический размер, в указанном месте. |
| [DrawImageUnscaled](./drawimageunscaled/)(const SharedPtr\<Image\>\&, const Point\&) | Рисует указанное изображение, используя его оригинальный физический размер, в указанном месте. |
| [DrawImageUnscaledAndClipped](./drawimageunscaledandclipped/)(const SharedPtr\<Image\>\&, Rectangle) | НЕ РЕАЛИЗОВАНО. |
| [DrawLine](./drawline/)(const SharedPtr\<Pen\>\&, Point, Point) | Рисует указанную линию, используя указанное перо. |
| [DrawLine](./drawline/)(const SharedPtr\<Pen\>\&, PointF, PointF) | Рисует указанную линию, используя указанное перо. |
| [DrawLine](./drawline/)(const SharedPtr\<Pen\>\&, int, int, int, int) | Рисует указанную линию, используя указанное перо. |
| [DrawLine](./drawline/)(const SharedPtr\<Pen\>\&, float, float, float, float) | Рисует указанную линию, используя указанное перо. |
| [DrawLines](./drawlines/)(const SharedPtr\<Pen\>\&, const System::ArrayPtr\<System::Drawing::Point\>\&) | Рисует серию отрезков, используя указанное перо. |
| [DrawLines](./drawlines/)(const SharedPtr\<Pen\>\&, const System::ArrayPtr\<System::Drawing::PointF\>\&) | Рисует серию отрезков, используя указанное перо. |
| [DrawPath](./drawpath/)(const SharedPtr\<Pen\>\&, const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Рисует указанный путь, используя указанное перо. |
| [DrawPie](./drawpie/)(const SharedPtr\<Pen\>\&, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t) | Рисует указанный сектор, используя указанное перо, на поверхности, представленной текущим объектом. |
| [DrawPie](./drawpie/)(const SharedPtr\<Pen\>\&, float, float, float, float, float, float) | Рисует указанный сектор, используя указанное перо, на поверхности, представленной текущим объектом. |
| [DrawPie](./drawpie/)(const SharedPtr\<Pen\>\&, Rectangle, float, float) | Рисует указанный сектор, используя указанное перо, на поверхности, представленной текущим объектом. |
| [DrawPie](./drawpie/)(const SharedPtr\<Pen\>\&, RectangleF, float, float) | Рисует указанный сектор, используя указанное перо, на поверхности, представленной текущим объектом. |
| [DrawPolygon](./drawpolygon/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&) | Рисует многоугольник, используя указанное перо. |
| [DrawPolygon](./drawpolygon/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&) | Рисует многоугольник, используя указанное перо. |
| [DrawRectangle](./drawrectangle/)(const SharedPtr\<Pen\>\&, int, int, int, int) | Рисует указанный прямоугольник, используя указанное перо, на поверхности, представленной текущим объектом. |
| [DrawRectangle](./drawrectangle/)(const SharedPtr\<Pen\>\&, float, float, float, float) | Рисует указанный прямоугольник, используя указанное перо, на поверхности, представленной текущим объектом. |
| [DrawRectangle](./drawrectangle/)(const SharedPtr\<Pen\>\&, Rectangle) | Рисует указанный прямоугольник, используя указанное перо, на поверхности, представленной текущим объектом. |
| [DrawRectangles](./drawrectangles/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Rectangle\>\&) | Рисует серию прямоугольников, используя указанное перо. |
| [DrawRectangles](./drawrectangles/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<RectangleF\>\&) | Рисует серию прямоугольников, используя указанное перо. |
| [DrawString](./drawstring/)(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, PointF, const System::SharedPtr\<System::Drawing::StringFormat\>\&) | Рисует указанную строку в указанном месте, используя указанный шрифт и кисть. |
| [DrawString](./drawstring/)(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, RectangleF, const System::SharedPtr\<System::Drawing::StringFormat\>\&) | Рисует указанную строку в указанном прямоугольнике, используя указанный шрифт и кисть. |
| [DrawString](./drawstring/)(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, float, float, const System::SharedPtr\<System::Drawing::StringFormat\>\&) | Рисует указанную строку в указанном месте, используя указанный шрифт и кисть. |
| [EndContainer](./endcontainer/)(const SharedPtr\<Drawing2D::GraphicsContainer\>\&) | Закрывает текущий контейнер и восстанавливает состояние этого объекта из состояния сохранённого контейнера. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, const ArrayPtr\<PointF\>\&, Graphics::EnumerateMetafileProc) | НЕ РЕАЛИЗОВАНО. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, const ArrayPtr\<Point\>\&, Graphics::EnumerateMetafileProc) | НЕ РЕАЛИЗОВАНО. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, Point, Graphics::EnumerateMetafileProc) | НЕ РЕАЛИЗОВАНО. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, PointF, Graphics::EnumerateMetafileProc) | НЕ РЕАЛИЗОВАНО. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, Rectangle, Graphics::EnumerateMetafileProc) | НЕ РЕАЛИЗОВАНО. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, RectangleF, Graphics::EnumerateMetafileProc) | НЕ РЕАЛИЗОВАНО. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, Point, Rectangle, GraphicsUnit, Graphics::EnumerateMetafileProc) | НЕ РЕАЛИЗОВАНО. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, PointF, RectangleF, GraphicsUnit, Graphics::EnumerateMetafileProc) | НЕ РЕАЛИЗОВАНО. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, const ArrayPtr\<Point\>\&, Rectangle, GraphicsUnit, Graphics::EnumerateMetafileProc) | НЕ РЕАЛИЗОВАНО. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, const ArrayPtr\<PointF\>\&, RectangleF, GraphicsUnit, Graphics::EnumerateMetafileProc) | НЕ РЕАЛИЗОВАНО. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, Rectangle, Rectangle, GraphicsUnit, Graphics::EnumerateMetafileProc) | НЕ РЕАЛИЗОВАНО. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, RectangleF, RectangleF, GraphicsUnit, Graphics::EnumerateMetafileProc) | НЕ РЕАЛИЗОВАНО. |
| [ExcludeClip](./excludeclip/)(Rectangle) | НЕ РЕАЛИЗОВАНО. |
| [ExcludeClip](./excludeclip/)(const SharedPtr\<Region\>\&) | НЕ РЕАЛИЗОВАНО. |
| [FillClosedCurve](./fillclosedcurve/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<PointF\>\&, Drawing2D::FillMode, float) | Рисует замкнутый сплайн, используя указанную кисть. |
| [FillClosedCurve](./fillclosedcurve/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<Point\>\&, Drawing2D::FillMode, float) | Рисует замкнутый сплайн, используя указанную кисть. |
| [FillEllipse](./fillellipse/)(const SharedPtr\<Brush\>\&, Rectangle) | Заполняет внутреннюю часть эллипса, указанного ограничивающим прямоугольником, используя указанную кисть. |
| [FillEllipse](./fillellipse/)(const SharedPtr\<Brush\>\&, RectangleF) | Заполняет внутреннюю часть эллипса, указанного ограничивающим прямоугольником, используя указанную кисть. |
| [FillEllipse](./fillellipse/)(const SharedPtr\<Brush\>\&, int, int, int, int) | Заполняет внутреннюю часть эллипса, указанного ограничивающим прямоугольником, используя указанную кисть. |
| [FillEllipse](./fillellipse/)(const SharedPtr\<Brush\>\&, float, float, float, float) | Заполняет внутреннюю часть эллипса, указанного ограничивающим прямоугольником, используя указанную кисть. |
| [FillPath](./fillpath/)(const SharedPtr\<Brush\>\&, const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Заполняет внутренние области указанного пути, используя указанную кисть. |
| [FillPie](./fillpie/)(const SharedPtr\<Brush\>\&, int, int, int, int, int, int) | Заполняет указанный сектор, используя указанную кисть, на поверхности, представленной текущим объектом. |
| [FillPie](./fillpie/)(const SharedPtr\<Brush\>\&, float, float, float, float, float, float) | Заполняет указанный сектор, используя указанную кисть, на поверхности, представленной текущим объектом. |
| [FillPie](./fillpie/)(const SharedPtr\<Brush\>\&, Rectangle, float, float) | Заполняет указанный сектор, используя указанную кисть, на поверхности, представленной текущим объектом. |
| [FillPolygon](./fillpolygon/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<Point\>\&, Drawing2D::FillMode) | Заполняет внутренние области указанного многоугольника, используя указанную кисть. |
| [FillPolygon](./fillpolygon/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<PointF\>\&, Drawing2D::FillMode) | Заполняет внутренние области указанного многоугольника, используя указанную кисть. |
| [FillRectangle](./fillrectangle/)(const SharedPtr\<Brush\>\&, float, float, float, float) | Заполняет указанный прямоугольник указанной кистью. |
| [FillRectangle](./fillrectangle/)(const SharedPtr\<Brush\>\&, int, int, int, int) | Заполняет указанный прямоугольник указанной кистью. |
| [FillRectangle](./fillrectangle/)(const SharedPtr\<Brush\>\&, Rectangle) | Заполняет указанный прямоугольник указанной кистью. |
| [FillRectangle](./fillrectangle/)(const SharedPtr\<Brush\>\&, RectangleF) | Заполняет указанный прямоугольник указанной кистью. |
| [FillRectangles](./fillrectangles/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<Rectangle\>\&) | Заполняет серию прямоугольников, используя указанную кисть. |
| [FillRectangles](./fillrectangles/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<RectangleF\>\&) | Заполняет серию прямоугольников, используя указанную кисть. |
| [FillRegion](./fillregion/)(const SharedPtr\<Brush\>\&, const SharedPtr\<Region\>\&) | Заполняет внутренние области указанного региона, используя указанную кисть. |
| [Flush](./flush/)(Drawing2D::FlushIntention) | Запускает немедленное выполнение всех отложенных операций рисования. |
| static [FromHwnd](./fromhwnd/)(IntPtr) | НЕ РЕАЛИЗОВАНО. |
| static [FromHwndInternal](./fromhwndinternal/)(IntPtr) | НЕ РЕАЛИЗОВАНО. |
| static [FromImage](./fromimage/)(const SharedPtr\<Image\>\&) | Создаёт новый объект [Graphics](./) из указанного изображения. |
| [get_Clip](./get_clip/)() | Возвращает объект [Region](../region/), представляющий регион, ограничивающий область рисования поверхности, представленной текущим объектом [Graphics](./). |
| [get_ClipBounds](./get_clipbounds/)() const | Возвращает прямоугольник, ограничивающий область отсечения поверхности, представленной текущим объектом. |
| [get_CompositingMode](./get_compositingmode/)() | Возвращает значение, указывающее, как составные изображения рисуются на поверхности, представленной текущим объектом. |
| [get_CompositingQuality](./get_compositingquality/)() | Возвращает значение, указывающее уровень качества, используемый при составлении изображений. |
| [get_DpiX](./get_dpix/)() | Возвращает горизонтальное разрешение. |
| [get_DpiY](./get_dpiy/)() | Возвращает вертикальное разрешение. |
| [get_InterpolationMode](./get_interpolationmode/)() | Возвращает значение, указывающее режим интерполяции, связанный с текущим объектом. |
| [get_IsClipEmpty](./get_isclipempty/)() const | НЕ РЕАЛИЗОВАНО. |
| [get_IsVisibleClipEmpty](./get_isvisibleclipempty/)() const | НЕ РЕАЛИЗОВАНО. |
| [get_PageScale](./get_pagescale/)() const | Возвращает масштаб между мировыми единицами и единицами страницы для текущего объекта [Graphics](./). |
| [get_PageUnit](./get_pageunit/)() const | Возвращает единицы измерения, используемые для координат страницы на поверхности, представленной текущим объектом. |
| [get_PixelOffsetMode](./get_pixeloffsetmode/)() | Возвращает значение, указывающее, как пиксели смещаются во время рендеринга на поверхности, представленной текущим объектом. |
| [get_RenderingOrigin](./get_renderingorigin/)() const | Возвращает объект [Point](../point/), представляющий начало рендеринга текущего объекта [Graphics](./) для дизеринга и штриховых кистей. |
| [get_SmoothingMode](./get_smoothingmode/)() | Возвращает значение, указывающее режим сглаживания, используемый во время рендеринга на поверхности, представленной текущим объектом. |
| [get_TextContrast](./get_textcontrast/)() const | НЕ РЕАЛИЗОВАНО. |
| [get_TextRenderingHint](./get_textrenderinghint/)() | Возвращает значение, указывающее качество рендеринга текста. |
| [get_Transform](./get_transform/)() | Возвращает геометрическое преобразование мира для текущего объекта [Graphics](./). |
| [get_VisibleClipBounds](./get_visibleclipbounds/)() const | Возвращает объект [RectangleF](../rectanglef/), представляющий ограничивающий прямоугольник видимого региона отсечения текущего объекта [Graphics](./). |
| [GetHdc](./gethdc/)() | НЕ РЕАЛИЗОВАНО. |
| [GetNearestColor](./getnearestcolor/)(Color) | НЕ РЕАЛИЗОВАНО. |
| [GetSkCanvas](./getskcanvas/)() const |  |
| [IntersectClip](./intersectclip/)(const System::SharedPtr\<Region\>\&) | Обновляет регион отсечения этого объекта до пересечения текущего региона отсечения и указанного региона. |
| [IntersectClip](./intersectclip/)(System::Drawing::RectangleF) | Обновляет регион отсечения этого объекта до пересечения текущего региона отсечения и указанного региона. |
| [IntersectClip](./intersectclip/)(System::Drawing::Rectangle) | Обновляет регион отсечения этого объекта до пересечения текущего региона отсечения и указанного региона. |
| [IsVisible](./isvisible/)(Point) | Определяет, находится ли указанная точка внутри видимого региона отсечения текущего объекта [Graphics](./). |
| [IsVisible](./isvisible/)(PointF) | НЕ РЕАЛИЗОВАНО. |
| [IsVisible](./isvisible/)(Rectangle) | НЕ РЕАЛИЗОВАНО. |
| [IsVisible](./isvisible/)(RectangleF) | НЕ РЕАЛИЗОВАНО. |
| [IsVisible](./isvisible/)(int32_t, int32_t) | НЕ РЕАЛИЗОВАНО. |
| [IsVisible](./isvisible/)(float, float) | НЕ РЕАЛИЗОВАНО. |
| [IsVisible](./isvisible/)(float, float, float, float) | НЕ РЕАЛИЗОВАНО. |
| [IsVisible](./isvisible/)(int32_t, int32_t, int32_t, int32_t) | НЕ РЕАЛИЗОВАНО. |
| [MeasureCharacterRanges](./measurecharacterranges/)(const System::String\&, const SharedPtr\<Font\>\&, RectangleF, const SharedPtr\<StringFormat\>\&) | Возвращает массив областей, каждая из которых ограничивает позиции символов в указанной строке. |
| [MeasureString](./measurestring/)(String const\&, System::SharedPtr\<Font\> const\&, PointF const\&, System::SharedPtr\<StringFormat\> const\&) const | Возвращает размер указанной строки при отрисовке заданным шрифтом в указанном формате. |
| [MeasureString](./measurestring/)(String const\&, System::SharedPtr\<Font\> const\&, int, System::SharedPtr\<StringFormat\> const\&) const | Возвращает размер указанной строки при отрисовке заданным шрифтом в указанном формате. |
| [MeasureString](./measurestring/)(String const\&, System::SharedPtr\<Font\> const\&, SizeF const\&, System::SharedPtr\<StringFormat\> const\&, int\&, int\&) const | НЕ РЕАЛИЗОВАНО. |
| [MeasureString](./measurestring/)(String const\&, System::SharedPtr\<Font\> const\&, SizeF const\&, System::SharedPtr\<StringFormat\> const\&) const | Возвращает размер указанной строки при отрисовке заданным шрифтом в указанном формате. |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Drawing2D::Matrix\>\&, Drawing2D::MatrixOrder) | Умножает матрицу мирового преобразования текущего объекта [Graphics](./) на указанную матрицу. |
| [ReleaseHdc](./releasehdc/)() | НЕ РЕАЛИЗОВАНО. |
| [ReleaseHdc](./releasehdc/)(IntPtr) | НЕ РЕАЛИЗОВАНО. |
| [ResetClip](./resetclip/)() | Сбрасывает область отсечения для этого объекта Graphics в бесконечную область. |
| [ResetTransform](./resettransform/)() | Сбрасывает матрицу мирового преобразования текущего объекта, делая её единичной матрицей. |
| [Restore](./restore/)(const SharedPtr\<Drawing2D::GraphicsState\>\&) | Восстанавливает состояние этого объекта из сохранённого состояния. |
| [RotateTransform](./rotatetransform/)(float, Drawing2D::MatrixOrder) | Применяет указанное вращение к матрице мирового преобразования текущего объекта [Graphics](./) в указанном порядке. |
| [Save](./save/)() | Сохраняет текущее состояние этого объекта и возвращает сохранённое состояние. |
| [ScaleTransform](./scaletransform/)(float, float, Drawing2D::MatrixOrder) | Применяет указанный вектор масштабирования к матрице мирового преобразования текущего объекта. |
| [set_Clip](./set_clip/)(const SharedPtr\<Region\>\&) | Устанавливает область, ограничивающую область рисования поверхности, представленной текущим объектом. |
| [set_CompositingMode](./set_compositingmode/)(Drawing2D::CompositingMode) | Устанавливает значение, определяющее, как составные изображения отрисовываются на поверхности, представленной текущим объектом. |
| [set_CompositingQuality](./set_compositingquality/)(Drawing2D::CompositingQuality) | Устанавливает значение, определяющее уровень качества, используемый при составлении изображений. |
| [set_InterpolationMode](./set_interpolationmode/)(Drawing2D::InterpolationMode) | Устанавливает значение, указывающее режим интерполяции, связанный с текущим объектом. |
| [set_PageScale](./set_pagescale/)(float) | Устанавливает масштабирование между мировыми единицами и единицами страницы для текущего объекта [Graphics](./). |
| [set_PageUnit](./set_pageunit/)(GraphicsUnit) | Устанавливает единицы измерения, используемые для координат страниц на поверхности, представленной текущим объектом. |
| [set_PixelOffsetMode](./set_pixeloffsetmode/)(Drawing2D::PixelOffsetMode) | Устанавливает значение, определяющее, как пиксели должны смещаться во время отрисовки на поверхности, представленной текущим объектом. |
| [set_RenderingOrigin](./set_renderingorigin/)(Point) | Устанавливает объект [Point](../point/), определяющий начало отрисовки текущего объекта [Graphics](./) для дизеринга и штриховых кистей. |
| [set_SmoothingMode](./set_smoothingmode/)(Drawing2D::SmoothingMode) | Устанавливает значение, определяющее режим сглаживания, используемый во время отрисовки на поверхности, представленной текущим объектом. |
| [set_TextContrast](./set_textcontrast/)(int32_t) | НЕ РЕАЛИЗОВАНО. |
| [set_TextRenderingHint](./set_textrenderinghint/)(Text::TextRenderingHint) | Устанавливает значение, определяющее качество отрисовки текста. |
| [set_Transform](./set_transform/)(const SharedPtr\<Drawing2D::Matrix\>\&) | Устанавливает геометрическое мировое преобразование для текущего объекта [Graphics](./). |
| [SetClip](./setclip/)(const SharedPtr\<Region\>\&, Drawing2D::CombineMode) | Устанавливает область отсечения поверхности рисования, представленной текущим объектом [Graphics](./), в результат указанной операции, объединяющей текущую область отсечения и указанную область. |
| [SetClip](./setclip/)(Rectangle, Drawing2D::CombineMode) | Устанавливает область отсечения поверхности рисования, представленной текущим объектом [Graphics](./), в результат указанной операции, объединяющей текущую область отсечения и указанную область. |
| [SetClip](./setclip/)(RectangleF, Drawing2D::CombineMode) | Устанавливает область отсечения поверхности рисования, представленной текущим объектом [Graphics](./), в результат указанной операции, объединяющей текущую область отсечения и указанную область. |
| [SetClip](./setclip/)(const SharedPtr\<Graphics\>\&, Drawing2D::CombineMode) | НЕ РЕАЛИЗОВАНО. |
| [SetClip](./setclip/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&, Drawing2D::CombineMode) | Устанавливает область отсечения поверхности рисования, представленной текущим объектом [Graphics](./), в результат указанной операции, объединяющей текущую область отсечения и область, заданную графическим путем. |
| [TransformPoints](./transformpoints/)(Drawing2D::CoordinateSpace, Drawing2D::CoordinateSpace, const ArrayPtr\<System::Drawing::Point\>\&) | НЕ РЕАЛИЗОВАНО. |
| [TransformPoints](./transformpoints/)(Drawing2D::CoordinateSpace, Drawing2D::CoordinateSpace, const ArrayPtr\<System::Drawing::PointF\>\&) | НЕ РЕАЛИЗОВАНО. |
| [TranslateClip](./translateclip/)(int, int) | НЕ РЕАЛИЗОВАНО. |
| [TranslateClip](./translateclip/)(float, float) | НЕ РЕАЛИЗОВАНО. |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | Применяет указанный вектор переноса к матрице мирового преобразования текущего объекта [Graphics](./). |
| [~Graphics](./~graphics/)() |  |
## Typedefs

| Определение типа | Описание |
| --- | --- |
| [DrawImageAbort](./drawimageabort/) | Тип объекта функции обратного вызова, используемого в качестве аргумента метода DrawImage. |
| [EnumerateMetafileProc](./enumeratemetafileproc/) | Тип объекта функции обратного вызова, используемого в качестве аргумента метода EnumerateMetafile. |
## См. также

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
