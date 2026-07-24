---
title: "Aspose::Page::EPS::PsDocument 클래스"
linktitle: "PsDocument"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::EPS::PsDocument 클래스. 이 클래스는 C++에서 PS/EPS 문서를 캡슐화합니다."
type: docs
weight: 700
url: /ko/cpp/aspose.page.eps/psdocument/
---
## PsDocument class


이 클래스는 PS/EPS 문서를 캡슐화합니다.

```cpp
class PsDocument : public Aspose::Page::Document
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Clip](./clip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | 현재 그래픽 상태에 클립을 추가합니다. |
| [ClipAndNewPath](./clipandnewpath/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | 현재 그래픽 상태에 클립을 추가하고 "newpath" 연산자를 기록합니다. 이는 이 클리핑 경로와 이후의 경로(예: "charpath" 연산자로 윤곽이 그려진 글리프)와의 결합을 피하기 위해 필요합니다. |
| [ClipRectangle](./cliprectangle/)(System::Drawing::RectangleF) | 현재 그래픽 상태에 클리핑 사각형을 추가합니다. |
| [ClipText](./cliptext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float) | 주어진 폰트의 지정된 텍스트 윤곽선에서 클립을 추가합니다. |
| [ClosePage](./closepage/)() | 현재 페이지를 완료합니다. |
| [ConvertType1FontToTTF](./converttype1fonttottf/)(System::String, System::String) | Type 1 폰트를 **TrueType**으로 변환합니다. 변환된 TTF 폰트의 이름은 입력 Type 1 폰트와 동일하며 ".ttf" 확장자를 가집니다. TTF 파일은 지정된 출력 디렉터리에 저장됩니다. |
| [ConvertType3FontToTTF](./converttype3fonttottf/)(System::String, System::String) | Type 3 폰트를 **TrueType**으로 변환합니다. 변환된 TTF 폰트의 이름은 입력 Type 3 폰트 파일과 동일하며 ".ttf" 확장자를 가집니다. TTF 파일은 지정된 출력 디렉터리에 저장됩니다. |
| [ConvertType3FontToTTF](./converttype3fonttottf/)(System::String, System::SharedPtr\<System::IO::Stream\>) | Type 3 폰트를 **TrueType** 스트림으로 변환합니다. |
| [CropEps](./cropeps/)(System::String, System::ArrayPtr\<float\>) | 주어진 [PsDocument](./)를 [EPS](../) 파일로 자릅니다. 기존 %BoundingBox가 업데이트된 초기 [EPS](../) 파일을 저장하거나 새 파일이 생성됩니다. |
| [CropEps](./cropeps/)(System::SharedPtr\<System::IO::Stream\>, System::ArrayPtr\<float\>) | 주어진 [PsDocument](./)를 [EPS](../) 파일로 자릅니다. 기존 %BoundingBox가 업데이트된 초기 [EPS](../) 파일을 저장하거나 새 파일이 생성됩니다. |
| [Draw](./draw/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | 임의의 경로를 그립니다. |
| [DrawArc](./drawarc/)(double, double, double, double, double, double) | 호를 그립니다. |
| [DrawExplicitImageMask](./drawexplicitimagemask/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | 마스크된 이미지를 그립니다. |
| [DrawImage](./drawimage/)(System::SharedPtr\<System::Drawing::Bitmap\>) | 이미지를 그립니다. |
| [DrawImage](./drawimage/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, System::Drawing::Color) | 배경이 있는 변환된 이미지를 그립니다. |
| [DrawLine](./drawline/)(double, double, double, double) | 선분을 그립니다. |
| [DrawOval](./drawoval/)(double, double, double, double) | 타원을 그립니다. |
| [DrawPolygon](./drawpolygon/)(System::ArrayPtr\<int32_t\>, System::ArrayPtr\<int32_t\>, int32_t) | 다각형을 그립니다. |
| [DrawPolygon](./drawpolygon/)(System::ArrayPtr\<double\>, System::ArrayPtr\<double\>, int32_t) | 다각형을 그립니다. |
| [DrawPolyline](./drawpolyline/)(System::ArrayPtr\<int32_t\>, System::ArrayPtr\<int32_t\>, int32_t) | 폴리라인을 그립니다. |
| [DrawPolyline](./drawpolyline/)(System::ArrayPtr\<double\>, System::ArrayPtr\<double\>, int32_t) | 폴리라인을 그립니다. |
| [DrawRect](./drawrect/)(double, double, double, double) | 사각형을 그립니다. |
| [DrawRoundRect](./drawroundrect/)(double, double, double, double, double, double) | 둥근 사각형을 그립니다. |
| [DrawTransparentImage](./drawtransparentimage/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, int32_t) | 변환된 투명 이미지를 그립니다. 이미지에 알파 채널이 없으면 불투명 이미지로 그려집니다. |
| [ExtractEpsBoundingBox](./extractepsboundingbox/)() | [EPS](../) 파일을 읽고 %BoundingBox 주석에서 [EPS](../) 이미지의 경계 상자를 추출하거나 존재하지 않을 경우 기본 페이지 크기 (0, 0, 595, 842)의 경계를 사용합니다. |
| [ExtractEpsSize](./extractepssize/)() | [EPS](../) 파일을 읽고 %BoundingBox 주석에서 [EPS](../) 이미지의 크기를 추출하거나 존재하지 않을 경우 기본 페이지 크기 (595, 842)를 사용합니다. |
| [ExtractText](./extracttext/)(System::SharedPtr\<SaveOptions\>, int32_t, int32_t) | PS 파일에서 텍스트를 추출합니다. 텍스트는 Type 42 (**TrueType**) 폰트로 작성되었거나 Vector Map에 Type 42 폰트가 포함된 Type 0 폰트인 경우에만 추출할 수 있습니다. |
| [Fill](./fill/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | 임의의 경로를 채웁니다. |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | 글리프 내부를 채우고 글리프 윤곽을 그려 텍스트 문자열을 추가합니다. |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | 글리프 내부를 채우고 글리프 윤곽을 그려 텍스트 문자열을 추가합니다. |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | 글리프 내부를 채우고 글리프 윤곽을 그려 텍스트 문자열을 추가합니다. |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | 글리프 내부를 채우고 글리프 윤곽을 그려 텍스트 문자열을 추가합니다. |
| [FillArc](./fillarc/)(double, double, double, double, double, double) | 호를 채웁니다. |
| [FillOval](./filloval/)(double, double, double, double) | 타원을 채웁니다. |
| [FillPolygon](./fillpolygon/)(System::ArrayPtr\<int32_t\>, System::ArrayPtr\<int32_t\>, int32_t) | 다각형을 채웁니다. |
| [FillPolygon](./fillpolygon/)(System::ArrayPtr\<double\>, System::ArrayPtr\<double\>, int32_t) | 다각형을 채웁니다. |
| [FillRect](./fillrect/)(double, double, double, double) | 사각형을 채웁니다. |
| [FillRoundRect](./fillroundrect/)(double, double, double, double, double, double) | 둥근 사각형을 채웁니다. |
| [FillText](./filltext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float) | 글리프 내부를 채워 텍스트 문자열을 추가합니다. |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float) | 글리프 내부를 채워 텍스트 문자열을 추가합니다. |
| [FillText](./filltext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | 글리프 내부를 채워 텍스트 문자열을 추가합니다. |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | 글리프 내부를 채워 텍스트 문자열을 추가합니다. |
| [FillText](./filltext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | 글리프 내부를 채워 텍스트 문자열을 추가합니다. |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | 글리프 내부를 채워 텍스트 문자열을 추가합니다. |
| [FillText](./filltext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | 글리프 내부를 채워 텍스트 문자열을 추가합니다. |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | 글리프 내부를 채워 텍스트 문자열을 추가합니다. |
| [get_InputStream](./get_inputstream/)() | [PsDocument](./)을 스트림과 로드 옵션으로 초기화합니다. |
| [get_NumberOfPages](./get_numberofpages/)() const | 결과 PDF 문서의 페이지 수를 반환합니다. |
| [GetPaint](./getpaint/)() | 현재 그래픽 상태의 페인트를 가져옵니다. |
| [GetStroke](./getstroke/)() | 현재 그래픽 상태에 스트로크를 설정합니다. |
| [GetXmpMetadata](./getxmpmetadata/)() | PS/EPS 파일을 읽고 XmpMetdata가 이미 존재하면 추출하고, 존재하지 않으면 새로 추가합니다. |
| [MergeToPdf](./mergetopdf/)(System::String, System::ArrayPtr\<System::String\>, System::SharedPtr\<SaveOptions\>) | PS/EPS 파일을 장치에 병합합니다. |
| [MergeToPdf](./mergetopdf/)(System::SharedPtr\<System::IO::Stream\>, System::ArrayPtr\<System::String\>, System::SharedPtr\<SaveOptions\>) | PS/EPS 파일을 장치에 병합합니다. |
| [OpenPage](./openpage/)(float, float) | 새 페이지를 만들고 현재 페이지로 설정합니다. |
| [OpenPage](./openpage/)(System::String) | 문서 크기로 새 페이지를 만들고 현재 페이지로 설정합니다. |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float) | 글리프 윤곽선을 그려 텍스트 문자열을 추가합니다. |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float) | 글리프 윤곽선을 그려 텍스트 문자열을 추가합니다. |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | 글리프 윤곽선을 그려 텍스트 문자열을 추가합니다. |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | 글리프 윤곽선을 그려 텍스트 문자열을 추가합니다. |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | 글리프 윤곽선을 그려 텍스트 문자열을 추가합니다. |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | 글리프 윤곽선을 그려 텍스트 문자열을 추가합니다. |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | 글리프 윤곽선을 그려 텍스트 문자열을 추가합니다. |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | 글리프 윤곽선을 그려 텍스트 문자열을 추가합니다. |
| [PsDocument](./psdocument/)() | 빈 [PsDocument](./)을 초기화합니다. 이 생성자는 PostScript 파일과 관련되지 않은 추가 작업, 예를 들어 글꼴 변환에만 사용됩니다. |
| [PsDocument](./psdocument/)(System::String, System::SharedPtr\<Device::PsSaveOptions\>) | 초기화된 페이지와 함께 빈 [PsDocument](./)을 초기화합니다. |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) | 초기화된 페이지와 함께 빈 [PsDocument](./)을 초기화합니다. |
| [PsDocument](./psdocument/)(System::String, System::SharedPtr\<Device::PsSaveOptions\>, bool) | 빈 [PsDocument](./)을 초기화합니다. |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, bool) | 빈 [PsDocument](./)을 초기화합니다. |
| [PsDocument](./psdocument/)(System::String, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) | 문서 페이지 수가 사전에 알려진 경우 빈 [PsDocument](./)을 초기화합니다([Postscript](../../aspose.page.eps.postscript/) 문서 페이지 수). |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) | 문서 페이지 수가 사전에 알려진 경우 빈 [PsDocument](./)을 초기화합니다([Postscript](../../aspose.page.eps.postscript/) 문서 페이지 수). |
| [PsDocument](./psdocument/)(System::String) | [PsDocument](./)을 입력 PS/EPS 파일로 초기화합니다. |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>) | [PsDocument](./)을 PS/EPS 파일 스트림으로 초기화합니다. |
| [ResizeEps](./resizeeps/)(System::String, System::Drawing::SizeF, Units) | 주어진 [PsDocument](./)을 [EPS](../) 파일로 크기 조정합니다. 이 메서드는 [EPS](../) 크기를 추출한 후에만 사용됩니다. 초기 [EPS](../) filD:\ASPOSE.GIT\aspose.pdf.cpp\cs_porter_produce\Aspose.Page.Cpp.Page.Cpp\eps\src_eps\PsDocument.hThe output directory where image file will be saved.e 를 업데이트된 기존 %BoundingBox와 함께 저장하거나 새 %BoundingBox를 생성합니다. 또한 [Page](../../aspose.page/) 변환 행렬이 설정됩니다. |
| [ResizeEps](./resizeeps/)(System::SharedPtr\<System::IO::Stream\>, System::Drawing::SizeF, Units) | 주어진 [PsDocument](./)을 [EPS](../) 파일로 크기 조정합니다. 이 메서드는 [EPS](../) 크기를 추출한 후에만 사용됩니다. 초기 [EPS](../) 파일을 업데이트된 기존 %BoundingBox와 함께 저장하거나 새 %BoundingBox를 생성합니다. 또한 [Page](../../aspose.page/) 변환 행렬이 설정됩니다. |
| [Rotate](./rotate/)(float) | 원점을 기준으로 현재 그래픽 상태에 반시계 방향 회전을 추가합니다(현재 행렬 회전). |
| [Rotate](./rotate/)(int32_t) | 원점을 기준으로 현재 그래픽 상태에 반시계 방향 회전을 추가합니다(현재 행렬 회전). |
| [Save](./save/)(System::String) | [PsDocument](./)을 [EPS](../) 파일로 저장합니다. 이 메서드는 [XMP](../../aspose.page.eps.xmp/) 메타데이터를 업데이트한 후에만 사용됩니다. 초기 [EPS](../) 파일을 업데이트된 기존 메타데이터와 함께 저장하거나 GetMetadata 메서드를 호출하면서 생성된 새 메타데이터를 저장합니다. 마지막 경우에는 필요한 모든 PostScript 코드와 [EPS](../) 주석이 추가됩니다. |
| [Save](./save/)(System::SharedPtr\<System::IO::Stream\>) | 주어진 [PsDocument](./)을 스트림에 저장합니다. 이 메서드는 [XMP](../../aspose.page.eps.xmp/) 메타데이터를 업데이트한 후에만 사용됩니다. 초기 [EPS](../) 파일을 업데이트된 기존 메타데이터와 함께 저장하거나 GetMetadata 메서드를 호출하면서 생성된 새 메타데이터를 저장합니다. 마지막 경우에는 필요한 모든 PostScript 코드와 [EPS](../) 주석이 추가됩니다. |
| [Save](./save/)() | [PsDocument](./)을 PS 또는 [EPS](../) 파일로 저장합니다. 이 메서드는 [PsDocument](./)이 처음부터 생성된 경우에만 사용됩니다. |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Device::ImageSaveOptions\>) | PS/EPS 파일을 이미지 파일로 저장합니다. 출력 디렉터리와 파일 이름은 입력 PS 파일과 동일합니다. 파일 확장자는 "options" 매개변수의 이미지 형식에 맞게 지정됩니다. 문서가 FileStream이 아닌 스트림으로 초기화된 경우, 이미지 파일은 현재 폴더에 기본 파일 이름 템플릿으로 저장됩니다. |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Device::ImageSaveOptions\>, System::String, System::String) | PS/EPS 파일을 지정된 디렉터리와 지정된 파일 이름으로 이미지 파일에 저장합니다. 파일 확장자는 "options" 매개변수의 이미지 형식에 맞게 지정됩니다. |
| [SaveAsImagesBytes](./saveasimagesbytes/)(System::SharedPtr\<Device::ImageSaveOptions\>) | PS/EPS 파일을 이미지 바이트 배열로 저장합니다. |
| [SaveAsPdf](./saveaspdf/)(System::String, System::SharedPtr\<Device::PdfSaveOptions\>) | PS/EPS 파일을 PDF 파일로 저장합니다. |
| [SaveAsPdf](./saveaspdf/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PdfSaveOptions\>) | PS/EPS 파일을 PDF 스트림으로 저장합니다. |
| static [SaveImageAsEps](./saveimageaseps/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) | 입력 스트림에서 PNG/JPEG/TIFF/BMP/GIF/EMF 이미지를 [EPS](../) 출력 스트림으로 저장합니다. |
| static [SaveImageAsEps](./saveimageaseps/)(System::String, System::String, System::SharedPtr\<Device::PsSaveOptions\>) | 파일에서 PNG/JPEG/TIFF/BMP/GIF/EMF 이미지를 [EPS](../) 파일로 저장합니다. |
| static [SaveImageAsEps](./saveimageaseps/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::String, System::SharedPtr\<Device::PsSaveOptions\>) | Bitmap 객체를 [EPS](../) 파일로 저장합니다. |
| static [SaveImageAsEps](./saveimageaseps/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) | Bitmap 객체를 [EPS](../) 출력 스트림으로 저장합니다. |
| [Scale](./scale/)(float, float) | 현재 그래픽 상태에 스케일을 추가합니다(현재 행렬 스케일). |
| [set_InputStream](./set_inputstream/)(System::SharedPtr\<System::IO::Stream\>) | [PsDocument](./)을 스트림과 로드 옵션으로 초기화합니다. |
| [SetPageDevice](./setpagedevice/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | 페이지 디바이스 매개변수를 설정합니다(연산자 "setpagedevice" PostScript 사양 참조). 여기에는 페이지 크기, 색상 등이 포함될 수 있습니다. |
| [SetPageSize](./setpagesize/)(float, float) | 페이지 크기를 설정합니다. 하나의 문서에서 서로 다른 크기의 페이지를 만들려면 이 메서드 직후에 [SetPageDevice](./setpagedevice/) 메서드를 사용하십시오. |
| [SetPaint](./setpaint/)(System::SharedPtr\<System::Drawing::Brush\>) | 현재 그래픽 상태에 페인트를 설정합니다. |
| [SetStroke](./setstroke/)(System::SharedPtr\<System::Drawing::Pen\>) | 현재 그래픽 상태에 스트로크를 설정합니다. |
| [SetTransform](./settransform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | 현재 변환을 이 변환으로 설정합니다. |
| [Shear](./shear/)(float, float) | 현재 그래픽 상태를 한 점을 중심으로 반시계 방향으로 회전시킵니다. |
| [Transform](./transform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | 현재 그래픽 상태에 변환을 추가합니다 (이 행렬을 현재 행렬과 연결합니다). |
| [Translate](./translate/)(float, float) | 현재 그래픽 상태에 평행 이동을 추가합니다 (현재 행렬을 변환합니다). |
| [WriteGraphicsRestore](./writegraphicsrestore/)() | 현재 그래픽 상태 복원을 기록합니다 (연산자 "grestore"에 대한 PostScript 사양을 참조하십시오). |
| [WriteGraphicsSave](./writegraphicssave/)() | 현재 그래픽 상태 저장을 기록합니다 (연산자 "gsave"에 대한 PostScript 사양을 참조하십시오). |
## 또 보기

* Class [Document](../../aspose.page/document/)
* Namespace [Aspose::Page::EPS](../)
* Library [Aspose.Page for C++](../../)
