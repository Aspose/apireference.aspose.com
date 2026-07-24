---
title: "System::Drawing::Graphics 클래스"
linktitle: "Graphics"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::Graphics 클래스. 그리기 표면을 나타냅니다. 이 클래스의 객체는 반드시 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마세요. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하도록 사용하십시오."
type: docs
weight: 1000
url: /ko/cpp/system.drawing/graphics/
---
## Graphics class


그리기 표면을 나타냅니다. 이 클래스의 객체는 반드시 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마세요. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하도록 사용하십시오.

```cpp
class Graphics : public virtual System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [AddMetafileComment](./addmetafilecomment/)(const System::ArrayPtr\<uint8_t\>\&) | 구현되지 않음. |
| [BeginContainer](./begincontainer/)() | 현재 객체의 상태를 포함하는 컨테이너를 저장하고, 새 컨테이너를 열어 사용한 뒤 저장된 컨테이너를 반환합니다. |
| [BeginContainer](./begincontainer/)(Rectangle, Rectangle, GraphicsUnit) | 현재 객체의 상태를 포함하는 컨테이너를 저장하고, 새 컨테이너를 열어 사용한 뒤 저장된 컨테이너를 반환합니다. |
| [BeginContainer](./begincontainer/)(RectangleF, RectangleF, GraphicsUnit) | 현재 객체의 상태를 포함하는 컨테이너를 저장하고, 새 컨테이너를 열어 사용한 뒤 저장된 컨테이너를 반환합니다. |
| [Clear](./clear/)(Color) | 현재 객체가 나타내는 그리기 표면을 지우고 지정된 색으로 채웁니다. |
| [CopyFromScreen](./copyfromscreen/)(Point, Point, Size, CopyPixelOperation) | 구현되지 않음. |
| [CopyFromScreen](./copyfromscreen/)(int32_t, int32_t, int32_t, int32_t, Size, CopyPixelOperation) | 구현되지 않음. |
| [Dispose](./dispose/)() | 현재 객체가 획득한 모든 운영 체제 리소스를 해제합니다. |
| [DrawArc](./drawarc/)(const SharedPtr\<Pen\>\&, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t) | 현재 객체가 나타내는 표면에 지정된 펜을 사용하여 지정된 호를 그립니다. |
| [DrawArc](./drawarc/)(const SharedPtr\<Pen\>\&, float, float, float, float, float, float) | 현재 객체가 나타내는 표면에 지정된 펜을 사용하여 지정된 호를 그립니다. |
| [DrawArc](./drawarc/)(const SharedPtr\<Pen\>\&, Rectangle, float, float) | 현재 객체가 나타내는 표면에 지정된 펜을 사용하여 지정된 호를 그립니다. |
| [DrawArc](./drawarc/)(const SharedPtr\<Pen\>\&, RectangleF, float, float) | 현재 객체가 나타내는 표면에 지정된 펜을 사용하여 지정된 호를 그립니다. |
| [DrawBezier](./drawbezier/)(const SharedPtr\<Pen\>\&, const Point\&, const Point\&, const Point\&, const Point\&) | 구현되지 않음. |
| [DrawBezier](./drawbezier/)(const SharedPtr\<Pen\>\&, const PointF\&, const PointF\&, const PointF\&, const PointF\&) | 구현되지 않음. |
| [DrawBezier](./drawbezier/)(const SharedPtr\<Pen\>\&, float, float, float, float, float, float, float, float) | 구현되지 않음. |
| [DrawBeziers](./drawbeziers/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&) | 지정된 펜을 사용하여 일련의 베지어 스플라인을 그립니다. |
| [DrawBeziers](./drawbeziers/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&) | 지정된 펜을 사용하여 일련의 베지어 스플라인을 그립니다. |
| [DrawClosedCurve](./drawclosedcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&, float, Drawing2D::FillMode) | 지정된 펜을 사용하여 닫힌 스플라인을 그립니다. |
| [DrawClosedCurve](./drawclosedcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&, float, Drawing2D::FillMode) | 지정된 펜을 사용하여 닫힌 스플라인을 그립니다. |
| [DrawCurve](./drawcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&, float) | 지정된 펜을 사용하여 스플라인을 그립니다. |
| [DrawCurve](./drawcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&, float) | 지정된 펜을 사용하여 스플라인을 그립니다. |
| [DrawCurve](./drawcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&, int32_t, int32_t, float) | 지정된 펜을 사용하여 스플라인을 그립니다. |
| [DrawCurve](./drawcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&, int32_t, int32_t, float) | 지정된 펜을 사용하여 스플라인을 그립니다. |
| [DrawEllipse](./drawellipse/)(const SharedPtr\<Pen\>\&, Rectangle) | 현재 객체가 나타내는 표면에 지정된 펜을 사용하여 지정된 타원을 그립니다. |
| [DrawEllipse](./drawellipse/)(const SharedPtr\<Pen\>\&, RectangleF) | 현재 객체가 나타내는 표면에 지정된 펜을 사용하여 지정된 타원을 그립니다. |
| [DrawEllipse](./drawellipse/)(const SharedPtr\<Pen\>\&, int, int, int, int) | 현재 객체가 나타내는 표면에 지정된 펜을 사용하여 지정된 타원을 그립니다. |
| [DrawEllipse](./drawellipse/)(const SharedPtr\<Pen\>\&, float, float, float, float) | 현재 객체가 나타내는 표면에 지정된 펜을 사용하여 지정된 타원을 그립니다. |
| [DrawIcon](./drawicon/)(const SharedPtr\<Icon\>\&, Rectangle) | 구현되지 않음. |
| [DrawIcon](./drawicon/)(const SharedPtr\<Icon\>\&, int32_t, int32_t) | 구현되지 않음. |
| [DrawIconUnstretched](./drawiconunstretched/)(const SharedPtr\<Icon\>\&, Rectangle) | 구현되지 않음. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const System::ArrayPtr\<Point\>\&) | 구현되지 않음. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const System::ArrayPtr\<PointF\>\&, const RectangleF\&, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | 지정된 위치에 지정된 이미지의 지정된 영역을 그립니다. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const System::Details::ArrayView\<PointF\>\&, const RectangleF\&, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | 지정된 위치에 지정된 이미지의 지정된 영역을 그립니다. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const System::Details::StackArray\<PointF, N\>\&, const RectangleF\&, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | 지정된 위치에 지정된 이미지의 지정된 영역을 그립니다. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, int, int) | 지정된 위치에 지정된 이미지를 그립니다. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, float, float) | 지정된 위치에 지정된 이미지를 그립니다. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Point) | 지정된 위치에 지정된 이미지를 그립니다. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, PointF) | 지정된 위치에 지정된 이미지를 그립니다. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, int, int, int, int) | 지정된 사각형에 지정된 이미지를 그립니다. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, float, float, float, float) | 지정된 사각형에 지정된 이미지를 그립니다. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, RectangleF, RectangleF, GraphicsUnit) | 지정된 위치에 지정된 이미지의 지정된 영역을 그립니다. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, Rectangle, GraphicsUnit) | 지정된 위치에 지정된 이미지의 지정된 영역을 그립니다. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, int, int, Rectangle, GraphicsUnit) | 지정된 위치에 지정된 이미지의 지정된 영역을 그립니다. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const Rectangle\&) | 지정된 위치에 지정된 이미지를 그립니다. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const RectangleF\&) | 지정된 위치에 지정된 이미지를 그립니다. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, int, int, int, int, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | 지정된 사각형에 지정된 이미지의 지정된 영역을 그립니다. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, float, float, float, float, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | 지정된 사각형에 지정된 이미지의 지정된 영역을 그립니다. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, int, int, int, int, GraphicsUnit) | 지정된 사각형에 지정된 이미지의 지정된 영역을 그립니다. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, float, float, float, float, GraphicsUnit) | 지정된 사각형에 지정된 이미지의 지정된 영역을 그립니다. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, int, int, int, int, GraphicsUnit, const Imaging::ImageAttributesPtr\&, Graphics::DrawImageAbort) | 구현되지 않음. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, float, float, float, float, GraphicsUnit, const Imaging::ImageAttributesPtr\&, Graphics::DrawImageAbort) | 구현되지 않음. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, int, int, int, int, GraphicsUnit, const Imaging::ImageAttributesPtr\&, Graphics::DrawImageAbort, IntPtr) | 구현되지 않음. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, float, float, float, float, GraphicsUnit, const Imaging::ImageAttributesPtr\&, Graphics::DrawImageAbort, IntPtr) | 구현되지 않음. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const ArrayPtr\<PointF\>\&, RectangleF, GraphicsUnit) | 구현되지 않음. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const ArrayPtr\<PointF\>\&) | 구현되지 않음. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const ArrayPtr\<Point\>\&, Rectangle, GraphicsUnit) | 구현되지 않음. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const ArrayPtr\<Point\>\&, Rectangle, GraphicsUnit, const SharedPtr\<Imaging::ImageAttributes\>\&) | 지정된 위치에 지정된 이미지의 지정된 영역을 그립니다. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, float, float, RectangleF, GraphicsUnit) | 지정된 위치에 지정된 이미지의 지정된 영역을 그립니다. |
| [DrawImageUnscaled](./drawimageunscaled/)(const SharedPtr\<Image\>\&, int, int) | 지정된 위치에 원본 물리적 크기로 지정된 이미지를 그립니다. |
| [DrawImageUnscaled](./drawimageunscaled/)(const SharedPtr\<Image\>\&, int, int, int, int) | 지정된 위치에 원본 물리적 크기로 지정된 이미지를 그립니다. |
| [DrawImageUnscaled](./drawimageunscaled/)(const SharedPtr\<Image\>\&, const Rectangle\&) | 지정된 위치에 원본 물리적 크기로 지정된 이미지를 그립니다. |
| [DrawImageUnscaled](./drawimageunscaled/)(const SharedPtr\<Image\>\&, const Point\&) | 지정된 위치에 원본 물리적 크기로 지정된 이미지를 그립니다. |
| [DrawImageUnscaledAndClipped](./drawimageunscaledandclipped/)(const SharedPtr\<Image\>\&, Rectangle) | 구현되지 않음. |
| [DrawLine](./drawline/)(const SharedPtr\<Pen\>\&, Point, Point) | 지정된 펜을 사용하여 지정된 선을 그립니다. |
| [DrawLine](./drawline/)(const SharedPtr\<Pen\>\&, PointF, PointF) | 지정된 펜을 사용하여 지정된 선을 그립니다. |
| [DrawLine](./drawline/)(const SharedPtr\<Pen\>\&, int, int, int, int) | 지정된 펜을 사용하여 지정된 선을 그립니다. |
| [DrawLine](./drawline/)(const SharedPtr\<Pen\>\&, float, float, float, float) | 지정된 펜을 사용하여 지정된 선을 그립니다. |
| [DrawLines](./drawlines/)(const SharedPtr\<Pen\>\&, const System::ArrayPtr\<System::Drawing::Point\>\&) | 지정된 펜을 사용하여 일련의 선분을 그립니다. |
| [DrawLines](./drawlines/)(const SharedPtr\<Pen\>\&, const System::ArrayPtr\<System::Drawing::PointF\>\&) | 지정된 펜을 사용하여 일련의 선분을 그립니다. |
| [DrawPath](./drawpath/)(const SharedPtr\<Pen\>\&, const SharedPtr\<Drawing2D::GraphicsPath\>\&) | 지정된 펜을 사용하여 지정된 경로를 그립니다. |
| [DrawPie](./drawpie/)(const SharedPtr\<Pen\>\&, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t) | 현재 객체가 나타내는 표면에 지정된 펜을 사용하여 지정된 파이를 그립니다. |
| [DrawPie](./drawpie/)(const SharedPtr\<Pen\>\&, float, float, float, float, float, float) | 현재 객체가 나타내는 표면에 지정된 펜을 사용하여 지정된 파이를 그립니다. |
| [DrawPie](./drawpie/)(const SharedPtr\<Pen\>\&, Rectangle, float, float) | 현재 객체가 나타내는 표면에 지정된 펜을 사용하여 지정된 파이를 그립니다. |
| [DrawPie](./drawpie/)(const SharedPtr\<Pen\>\&, RectangleF, float, float) | 현재 객체가 나타내는 표면에 지정된 펜을 사용하여 지정된 파이를 그립니다. |
| [DrawPolygon](./drawpolygon/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&) | 지정된 펜을 사용하여 다각형을 그립니다. |
| [DrawPolygon](./drawpolygon/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&) | 지정된 펜을 사용하여 다각형을 그립니다. |
| [DrawRectangle](./drawrectangle/)(const SharedPtr\<Pen\>\&, int, int, int, int) | 현재 객체가 나타내는 표면에 지정된 펜을 사용하여 지정된 사각형을 그립니다. |
| [DrawRectangle](./drawrectangle/)(const SharedPtr\<Pen\>\&, float, float, float, float) | 현재 객체가 나타내는 표면에 지정된 펜을 사용하여 지정된 사각형을 그립니다. |
| [DrawRectangle](./drawrectangle/)(const SharedPtr\<Pen\>\&, Rectangle) | 현재 객체가 나타내는 표면에 지정된 펜을 사용하여 지정된 사각형을 그립니다. |
| [DrawRectangles](./drawrectangles/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Rectangle\>\&) | 지정된 펜을 사용하여 일련의 사각형을 그립니다. |
| [DrawRectangles](./drawrectangles/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<RectangleF\>\&) | 지정된 펜을 사용하여 일련의 사각형을 그립니다. |
| [DrawString](./drawstring/)(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, PointF, const System::SharedPtr\<System::Drawing::StringFormat\>\&) | 지정된 폰트와 브러시를 사용하여 지정된 위치에 지정된 문자열을 그립니다. |
| [DrawString](./drawstring/)(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, RectangleF, const System::SharedPtr\<System::Drawing::StringFormat\>\&) | 지정된 글꼴과 브러시를 사용하여 지정된 사각형 안에 지정된 문자열을 그립니다. |
| [DrawString](./drawstring/)(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, float, float, const System::SharedPtr\<System::Drawing::StringFormat\>\&) | 지정된 폰트와 브러시를 사용하여 지정된 위치에 지정된 문자열을 그립니다. |
| [EndContainer](./endcontainer/)(const SharedPtr\<Drawing2D::GraphicsContainer\>\&) | 현재 컨테이너를 닫고 저장된 컨테이너의 상태에서 이 객체의 상태를 복원합니다. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, const ArrayPtr\<PointF\>\&, Graphics::EnumerateMetafileProc) | 구현되지 않음. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, const ArrayPtr\<Point\>\&, Graphics::EnumerateMetafileProc) | 구현되지 않음. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, Point, Graphics::EnumerateMetafileProc) | 구현되지 않음. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, PointF, Graphics::EnumerateMetafileProc) | 구현되지 않음. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, Rectangle, Graphics::EnumerateMetafileProc) | 구현되지 않음. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, RectangleF, Graphics::EnumerateMetafileProc) | 구현되지 않음. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, Point, Rectangle, GraphicsUnit, Graphics::EnumerateMetafileProc) | 구현되지 않음. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, PointF, RectangleF, GraphicsUnit, Graphics::EnumerateMetafileProc) | 구현되지 않음. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, const ArrayPtr\<Point\>\&, Rectangle, GraphicsUnit, Graphics::EnumerateMetafileProc) | 구현되지 않음. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, const ArrayPtr\<PointF\>\&, RectangleF, GraphicsUnit, Graphics::EnumerateMetafileProc) | 구현되지 않음. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, Rectangle, Rectangle, GraphicsUnit, Graphics::EnumerateMetafileProc) | 구현되지 않음. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, RectangleF, RectangleF, GraphicsUnit, Graphics::EnumerateMetafileProc) | 구현되지 않음. |
| [ExcludeClip](./excludeclip/)(Rectangle) | 구현되지 않음. |
| [ExcludeClip](./excludeclip/)(const SharedPtr\<Region\>\&) | 구현되지 않음. |
| [FillClosedCurve](./fillclosedcurve/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<PointF\>\&, Drawing2D::FillMode, float) | 지정된 브러시를 사용하여 닫힌 스플라인을 그립니다. |
| [FillClosedCurve](./fillclosedcurve/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<Point\>\&, Drawing2D::FillMode, float) | 지정된 브러시를 사용하여 닫힌 스플라인을 그립니다. |
| [FillEllipse](./fillellipse/)(const SharedPtr\<Brush\>\&, Rectangle) | 경계 사각형으로 지정된 타원의 내부를 지정된 브러시로 채웁니다. |
| [FillEllipse](./fillellipse/)(const SharedPtr\<Brush\>\&, RectangleF) | 경계 사각형으로 지정된 타원의 내부를 지정된 브러시로 채웁니다. |
| [FillEllipse](./fillellipse/)(const SharedPtr\<Brush\>\&, int, int, int, int) | 경계 사각형으로 지정된 타원의 내부를 지정된 브러시로 채웁니다. |
| [FillEllipse](./fillellipse/)(const SharedPtr\<Brush\>\&, float, float, float, float) | 경계 사각형으로 지정된 타원의 내부를 지정된 브러시로 채웁니다. |
| [FillPath](./fillpath/)(const SharedPtr\<Brush\>\&, const SharedPtr\<Drawing2D::GraphicsPath\>\&) | 지정된 경로의 내부를 지정된 브러시로 채웁니다. |
| [FillPie](./fillpie/)(const SharedPtr\<Brush\>\&, int, int, int, int, int, int) | 현재 객체가 나타내는 표면 위에 지정된 브러시를 사용하여 지정된 파이(조각)를 채웁니다. |
| [FillPie](./fillpie/)(const SharedPtr\<Brush\>\&, float, float, float, float, float, float) | 현재 객체가 나타내는 표면 위에 지정된 브러시를 사용하여 지정된 파이(조각)를 채웁니다. |
| [FillPie](./fillpie/)(const SharedPtr\<Brush\>\&, Rectangle, float, float) | 현재 객체가 나타내는 표면 위에 지정된 브러시를 사용하여 지정된 파이(조각)를 채웁니다. |
| [FillPolygon](./fillpolygon/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<Point\>\&, Drawing2D::FillMode) | 지정된 다각형의 내부를 지정된 브러시로 채웁니다. |
| [FillPolygon](./fillpolygon/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<PointF\>\&, Drawing2D::FillMode) | 지정된 다각형의 내부를 지정된 브러시로 채웁니다. |
| [FillRectangle](./fillrectangle/)(const SharedPtr\<Brush\>\&, float, float, float, float) | 지정된 사각형을 지정된 브러시로 채웁니다. |
| [FillRectangle](./fillrectangle/)(const SharedPtr\<Brush\>\&, int, int, int, int) | 지정된 사각형을 지정된 브러시로 채웁니다. |
| [FillRectangle](./fillrectangle/)(const SharedPtr\<Brush\>\&, Rectangle) | 지정된 사각형을 지정된 브러시로 채웁니다. |
| [FillRectangle](./fillrectangle/)(const SharedPtr\<Brush\>\&, RectangleF) | 지정된 사각형을 지정된 브러시로 채웁니다. |
| [FillRectangles](./fillrectangles/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<Rectangle\>\&) | 지정된 브러시를 사용하여 일련의 사각형을 채웁니다. |
| [FillRectangles](./fillrectangles/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<RectangleF\>\&) | 지정된 브러시를 사용하여 일련의 사각형을 채웁니다. |
| [FillRegion](./fillregion/)(const SharedPtr\<Brush\>\&, const SharedPtr\<Region\>\&) | 지정된 영역의 내부를 지정된 브러시로 채웁니다. |
| [Flush](./flush/)(Drawing2D::FlushIntention) | 보류 중인 모든 그리기 작업을 즉시 실행하도록 트리거합니다. |
| static [FromHwnd](./fromhwnd/)(IntPtr) | 구현되지 않음. |
| static [FromHwndInternal](./fromhwndinternal/)(IntPtr) | 구현되지 않음. |
| static [FromImage](./fromimage/)(const SharedPtr\<Image\>\&) | 지정된 이미지에서 새로운 [Graphics](./) 객체를 생성합니다. |
| [get_Clip](./get_clip/)() | 현재 [Graphics](./) 객체가 나타내는 그리기 표면의 그리기 영역을 제한하는 영역을 나타내는 [Region](../region/) 객체를 반환합니다. |
| [get_ClipBounds](./get_clipbounds/)() const | 현재 객체가 나타내는 표면의 클리핑 영역을 경계하는 사각형을 반환합니다. |
| [get_CompositingMode](./get_compositingmode/)() | 현재 객체가 나타내는 표면에 합성된 이미지가 어떻게 그려지는지를 나타내는 값을 반환합니다. |
| [get_CompositingQuality](./get_compositingquality/)() | 이미지를 합성할 때 사용되는 품질 수준을 나타내는 값을 반환합니다. |
| [get_DpiX](./get_dpix/)() | 수평 해상도를 반환합니다. |
| [get_DpiY](./get_dpiy/)() | 수직 해상도를 반환합니다. |
| [get_InterpolationMode](./get_interpolationmode/)() | 현재 객체와 연관된 보간 모드를 나타내는 값을 반환합니다. |
| [get_IsClipEmpty](./get_isclipempty/)() const | 구현되지 않음. |
| [get_IsVisibleClipEmpty](./get_isvisibleclipempty/)() const | 구현되지 않음. |
| [get_PageScale](./get_pagescale/)() const | 현재 [Graphics](./) 객체에 대한 세계 단위와 페이지 단위 사이의 스케일링을 반환합니다. |
| [get_PageUnit](./get_pageunit/)() const | 현재 객체가 나타내는 표면에서 페이지 좌표에 사용되는 측정 단위를 반환합니다. |
| [get_PixelOffsetMode](./get_pixeloffsetmode/)() | 현재 객체가 나타내는 표면에서 렌더링 중 픽셀이 어떻게 오프셋되는지를 나타내는 값을 반환합니다. |
| [get_RenderingOrigin](./get_renderingorigin/)() const | 디더링 및 해치 브러시용 현재 [Graphics](./) 객체의 렌더링 원점을 나타내는 [Point](../point/) 객체를 반환합니다. |
| [get_SmoothingMode](./get_smoothingmode/)() | 현재 객체가 나타내는 표면에서 렌더링 중 사용되는 진정 모드를 나타내는 값을 반환합니다. |
| [get_TextContrast](./get_textcontrast/)() const | 구현되지 않음. |
| [get_TextRenderingHint](./get_textrenderinghint/)() | 텍스트 렌더링 품질을 나타내는 값을 반환합니다. |
| [get_Transform](./get_transform/)() | 현재 [Graphics](./) 객체에 대한 기하학적 세계 변환을 반환합니다. |
| [get_VisibleClipBounds](./get_visibleclipbounds/)() const | 현재 [Graphics](./) 객체의 보이는 클리핑 영역을 둘러싼 경계 사각형을 나타내는 [RectangleF](../rectanglef/) 객체를 반환합니다. |
| [GetHdc](./gethdc/)() | 구현되지 않음. |
| [GetNearestColor](./getnearestcolor/)(Color) | 구현되지 않음. |
| [GetSkCanvas](./getskcanvas/)() const |  |
| [IntersectClip](./intersectclip/)(const System::SharedPtr\<Region\>\&) | 이 객체의 클립 영역을 현재 클립과 지정된 클립의 교차 영역으로 업데이트합니다. |
| [IntersectClip](./intersectclip/)(System::Drawing::RectangleF) | 이 객체의 클립 영역을 현재 클립과 지정된 클립의 교차 영역으로 업데이트합니다. |
| [IntersectClip](./intersectclip/)(System::Drawing::Rectangle) | 이 객체의 클립 영역을 현재 클립과 지정된 클립의 교차 영역으로 업데이트합니다. |
| [IsVisible](./isvisible/)(Point) | 지정된 점이 현재 [Graphics](./) 객체의 보이는 클립 영역에 포함되는지 여부를 결정합니다. |
| [IsVisible](./isvisible/)(PointF) | 구현되지 않음. |
| [IsVisible](./isvisible/)(Rectangle) | 구현되지 않음. |
| [IsVisible](./isvisible/)(RectangleF) | 구현되지 않음. |
| [IsVisible](./isvisible/)(int32_t, int32_t) | 구현되지 않음. |
| [IsVisible](./isvisible/)(float, float) | 구현되지 않음. |
| [IsVisible](./isvisible/)(float, float, float, float) | 구현되지 않음. |
| [IsVisible](./isvisible/)(int32_t, int32_t, int32_t, int32_t) | 구현되지 않음. |
| [MeasureCharacterRanges](./measurecharacterranges/)(const System::String\&, const SharedPtr\<Font\>\&, RectangleF, const SharedPtr\<StringFormat\>\&) | 지정된 문자열에서 문자 위치를 둘러싼 각 영역의 배열을 반환합니다. |
| [MeasureString](./measurestring/)(String const\&, System::SharedPtr\<Font\> const\&, PointF const\&, System::SharedPtr\<StringFormat\> const\&) const | 지정된 형식과 지정된 글꼴로 그려졌을 때 지정된 문자열의 크기를 반환합니다. |
| [MeasureString](./measurestring/)(String const\&, System::SharedPtr\<Font\> const\&, int, System::SharedPtr\<StringFormat\> const\&) const | 지정된 형식과 지정된 글꼴로 그려졌을 때 지정된 문자열의 크기를 반환합니다. |
| [MeasureString](./measurestring/)(String const\&, System::SharedPtr\<Font\> const\&, SizeF const\&, System::SharedPtr\<StringFormat\> const\&, int\&, int\&) const | 구현되지 않음. |
| [MeasureString](./measurestring/)(String const\&, System::SharedPtr\<Font\> const\&, SizeF const\&, System::SharedPtr\<StringFormat\> const\&) const | 지정된 형식과 지정된 글꼴로 그려졌을 때 지정된 문자열의 크기를 반환합니다. |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Drawing2D::Matrix\>\&, Drawing2D::MatrixOrder) | 현재 [Graphics](./) 객체의 세계 변환 행렬에 지정된 행렬을 곱합니다. |
| [ReleaseHdc](./releasehdc/)() | 구현되지 않음. |
| [ReleaseHdc](./releasehdc/)(IntPtr) | 구현되지 않음. |
| [ResetClip](./resetclip/)() | 이 그래픽의 클립 영역을 무한 영역으로 재설정합니다. |
| [ResetTransform](./resettransform/)() | 현재 객체의 세계 변환 행렬을 항등 행렬이 되도록 재설정합니다. |
| [Restore](./restore/)(const SharedPtr\<Drawing2D::GraphicsState\>\&) | 저장된 상태에서 이 객체의 상태를 복원합니다. |
| [RotateTransform](./rotatetransform/)(float, Drawing2D::MatrixOrder) | 지정된 순서대로 현재 [Graphics](./) 객체의 세계 변환 행렬에 지정된 회전을 적용합니다. |
| [Save](./save/)() | 이 객체의 현재 상태를 저장하고 저장된 상태를 반환합니다. |
| [ScaleTransform](./scaletransform/)(float, float, Drawing2D::MatrixOrder) | 지정된 스케일 벡터를 현재 객체의 세계 변환 행렬에 적용합니다. |
| [set_Clip](./set_clip/)(const SharedPtr\<Region\>\&) | 현재 객체가 나타내는 그리기 표면의 그리기 영역을 제한하는 영역을 설정합니다. |
| [set_CompositingMode](./set_compositingmode/)(Drawing2D::CompositingMode) | 현재 객체가 나타내는 표면에 합성된 이미지가 그려지는 방식을 지정하는 값을 설정합니다. |
| [set_CompositingQuality](./set_compositingquality/)(Drawing2D::CompositingQuality) | 이미지를 합성할 때 사용할 품질 수준을 지정하는 값을 설정합니다. |
| [set_InterpolationMode](./set_interpolationmode/)(Drawing2D::InterpolationMode) | 현재 객체와 연관된 보간 모드를 나타내는 값을 설정합니다. |
| [set_PageScale](./set_pagescale/)(float) | 현재 [Graphics](./) 객체에 대한 세계 단위와 페이지 단위 사이의 스케일을 설정합니다. |
| [set_PageUnit](./set_pageunit/)(GraphicsUnit) | 현재 객체가 나타내는 표면의 페이지 좌표에 사용되는 측정 단위를 설정합니다. |
| [set_PixelOffsetMode](./set_pixeloffsetmode/)(Drawing2D::PixelOffsetMode) | 현재 객체가 나타내는 표면에서 렌더링 중 픽셀을 오프셋하는 방식을 지정하는 값을 설정합니다. |
| [set_RenderingOrigin](./set_renderingorigin/)(Point) | 디더링 및 해치 브러시용 현재 [Graphics](./) 객체의 렌더링 원점을 지정하는 [Point](../point/) 객체를 설정합니다. |
| [set_SmoothingMode](./set_smoothingmode/)(Drawing2D::SmoothingMode) | 현재 객체가 나타내는 표면에서 렌더링 중 사용되는 스무딩 모드를 지정하는 값을 설정합니다. |
| [set_TextContrast](./set_textcontrast/)(int32_t) | 구현되지 않음. |
| [set_TextRenderingHint](./set_textrenderinghint/)(Text::TextRenderingHint) | 텍스트 렌더링 품질을 지정하는 값을 설정합니다. |
| [set_Transform](./set_transform/)(const SharedPtr\<Drawing2D::Matrix\>\&) | 현재 [Graphics](./) 객체에 대한 기하학적 세계 변환을 설정합니다. |
| [SetClip](./setclip/)(const SharedPtr\<Region\>\&, Drawing2D::CombineMode) | 현재 [Graphics](./) 객체가 나타내는 그리기 표면의 클리핑 영역을 현재 클립 영역과 지정된 영역을 결합하는 지정된 연산의 결과로 설정합니다. |
| [SetClip](./setclip/)(Rectangle, Drawing2D::CombineMode) | 현재 [Graphics](./) 객체가 나타내는 그리기 표면의 클리핑 영역을 현재 클립 영역과 지정된 영역을 결합하는 지정된 연산의 결과로 설정합니다. |
| [SetClip](./setclip/)(RectangleF, Drawing2D::CombineMode) | 현재 [Graphics](./) 객체가 나타내는 그리기 표면의 클리핑 영역을 현재 클립 영역과 지정된 영역을 결합하는 지정된 연산의 결과로 설정합니다. |
| [SetClip](./setclip/)(const SharedPtr\<Graphics\>\&, Drawing2D::CombineMode) | 구현되지 않음. |
| [SetClip](./setclip/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&, Drawing2D::CombineMode) | 현재 [Graphics](./) 객체가 나타내는 그리기 표면의 클리핑 영역을 현재 클립 영역과 그래픽 경로로 지정된 영역을 결합하는 지정된 연산의 결과로 설정합니다. |
| [TransformPoints](./transformpoints/)(Drawing2D::CoordinateSpace, Drawing2D::CoordinateSpace, const ArrayPtr\<System::Drawing::Point\>\&) | 구현되지 않음. |
| [TransformPoints](./transformpoints/)(Drawing2D::CoordinateSpace, Drawing2D::CoordinateSpace, const ArrayPtr\<System::Drawing::PointF\>\&) | 구현되지 않음. |
| [TranslateClip](./translateclip/)(int, int) | 구현되지 않음. |
| [TranslateClip](./translateclip/)(float, float) | 구현되지 않음. |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | 지정된 변환 벡터를 현재 [Graphics](./) 객체의 세계 변환 행렬에 적용합니다. |
| [~Graphics](./~graphics/)() |  |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [DrawImageAbort](./drawimageabort/) | DrawImage 메서드의 인수로 사용되는 콜백 함수 객체의 유형입니다. |
| [EnumerateMetafileProc](./enumeratemetafileproc/) | EnumerateMetafile 메서드의 인수로 사용되는 콜백 함수 객체의 유형입니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
