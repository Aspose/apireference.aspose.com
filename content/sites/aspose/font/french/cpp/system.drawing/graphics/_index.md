---
title: "classe System::Drawing::Graphics"
linktitle: "Graphiques"
second_title: "Aspose.Font pour C++"
description: "System::Drawing::Graphics class. Représente une surface de dessin. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 1000
url: /fr/cpp/system.drawing/graphics/
---
## Graphics class


Représente une surface de dessin. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class Graphics : public virtual System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [AddMetafileComment](./addmetafilecomment/)(const System::ArrayPtr\<uint8_t\>\&) | NON IMPLEMENTÉ. |
| [BeginContainer](./begincontainer/)() | Enregistre un conteneur avec l'état actuel de cet objet, ouvre et utilise un nouveau conteneur et renvoie le conteneur enregistré. |
| [BeginContainer](./begincontainer/)(Rectangle, Rectangle, GraphicsUnit) | Enregistre un conteneur avec l'état actuel de cet objet, ouvre et utilise un nouveau conteneur et renvoie le conteneur enregistré. |
| [BeginContainer](./begincontainer/)(RectangleF, RectangleF, GraphicsUnit) | Enregistre un conteneur avec l'état actuel de cet objet, ouvre et utilise un nouveau conteneur et renvoie le conteneur enregistré. |
| [Clear](./clear/)(Color) | Efface la surface de dessin représentée par l'objet actuel et la remplit avec la couleur spécifiée. |
| [CopyFromScreen](./copyfromscreen/)(Point, Point, Size, CopyPixelOperation) | NON IMPLEMENTÉ. |
| [CopyFromScreen](./copyfromscreen/)(int32_t, int32_t, int32_t, int32_t, Size, CopyPixelOperation) | NON IMPLEMENTÉ. |
| [Dispose](./dispose/)() | Libère toutes les ressources du système d'exploitation acquises par l'objet actuel. |
| [DrawArc](./drawarc/)(const SharedPtr\<Pen\>\&, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t) | Dessine l'arc spécifié en utilisant le stylo spécifié sur la surface représentée par l'objet actuel. |
| [DrawArc](./drawarc/)(const SharedPtr\<Pen\>\&, float, float, float, float, float, float) | Dessine l'arc spécifié en utilisant le stylo spécifié sur la surface représentée par l'objet actuel. |
| [DrawArc](./drawarc/)(const SharedPtr\<Pen\>\&, Rectangle, float, float) | Dessine l'arc spécifié en utilisant le stylo spécifié sur la surface représentée par l'objet actuel. |
| [DrawArc](./drawarc/)(const SharedPtr\<Pen\>\&, RectangleF, float, float) | Dessine l'arc spécifié en utilisant le stylo spécifié sur la surface représentée par l'objet actuel. |
| [DrawBezier](./drawbezier/)(const SharedPtr\<Pen\>\&, const Point\&, const Point\&, const Point\&, const Point\&) | NON IMPLEMENTÉ. |
| [DrawBezier](./drawbezier/)(const SharedPtr\<Pen\>\&, const PointF\&, const PointF\&, const PointF\&, const PointF\&) | NON IMPLEMENTÉ. |
| [DrawBezier](./drawbezier/)(const SharedPtr\<Pen\>\&, float, float, float, float, float, float, float, float) | NON IMPLEMENTÉ. |
| [DrawBeziers](./drawbeziers/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&) | Dessine une série de splines de Bézier en utilisant le stylo spécifié. |
| [DrawBeziers](./drawbeziers/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&) | Dessine une série de splines de Bézier en utilisant le stylo spécifié. |
| [DrawClosedCurve](./drawclosedcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&, float, Drawing2D::FillMode) | Dessine une spline fermée en utilisant le stylo spécifié. |
| [DrawClosedCurve](./drawclosedcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&, float, Drawing2D::FillMode) | Dessine une spline fermée en utilisant le stylo spécifié. |
| [DrawCurve](./drawcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&, float) | Dessine une spline en utilisant le stylo spécifié. |
| [DrawCurve](./drawcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&, float) | Dessine une spline en utilisant le stylo spécifié. |
| [DrawCurve](./drawcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&, int32_t, int32_t, float) | Dessine une spline en utilisant le stylo spécifié. |
| [DrawCurve](./drawcurve/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&, int32_t, int32_t, float) | Dessine une spline en utilisant le stylo spécifié. |
| [DrawEllipse](./drawellipse/)(const SharedPtr\<Pen\>\&, Rectangle) | Dessine l'ellipse spécifiée en utilisant le stylo spécifié sur la surface représentée par l'objet actuel. |
| [DrawEllipse](./drawellipse/)(const SharedPtr\<Pen\>\&, RectangleF) | Dessine l'ellipse spécifiée en utilisant le stylo spécifié sur la surface représentée par l'objet actuel. |
| [DrawEllipse](./drawellipse/)(const SharedPtr\<Pen\>\&, int, int, int, int) | Dessine l'ellipse spécifiée en utilisant le stylo spécifié sur la surface représentée par l'objet actuel. |
| [DrawEllipse](./drawellipse/)(const SharedPtr\<Pen\>\&, float, float, float, float) | Dessine l'ellipse spécifiée en utilisant le stylo spécifié sur la surface représentée par l'objet actuel. |
| [DrawIcon](./drawicon/)(const SharedPtr\<Icon\>\&, Rectangle) | NON IMPLEMENTÉ. |
| [DrawIcon](./drawicon/)(const SharedPtr\<Icon\>\&, int32_t, int32_t) | NON IMPLEMENTÉ. |
| [DrawIconUnstretched](./drawiconunstretched/)(const SharedPtr\<Icon\>\&, Rectangle) | NON IMPLEMENTÉ. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const System::ArrayPtr\<Point\>\&) | NON IMPLEMENTÉ. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const System::ArrayPtr\<PointF\>\&, const RectangleF\&, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | Dessine la région spécifiée de l'image spécifiée à l'emplacement spécifié. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const System::Details::ArrayView\<PointF\>\&, const RectangleF\&, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | Dessine la région spécifiée de l'image spécifiée à l'emplacement spécifié. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const System::Details::StackArray\<PointF, N\>\&, const RectangleF\&, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | Dessine la région spécifiée de l'image spécifiée à l'emplacement spécifié. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, int, int) | Dessine l'image spécifiée à l'emplacement spécifié. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, float, float) | Dessine l'image spécifiée à l'emplacement spécifié. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Point) | Dessine l'image spécifiée à l'emplacement spécifié. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, PointF) | Dessine l'image spécifiée à l'emplacement spécifié. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, int, int, int, int) | Dessine l'image spécifiée dans le rectangle spécifié. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, float, float, float, float) | Dessine l'image spécifiée dans le rectangle spécifié. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, RectangleF, RectangleF, GraphicsUnit) | Dessine la région spécifiée de l'image spécifiée à l'emplacement spécifié. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, Rectangle, GraphicsUnit) | Dessine la région spécifiée de l'image spécifiée à l'emplacement spécifié. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, int, int, Rectangle, GraphicsUnit) | Dessine la région spécifiée de l'image spécifiée à l'emplacement spécifié. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const Rectangle\&) | Dessine l'image spécifiée à l'emplacement spécifié. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const RectangleF\&) | Dessine l'image spécifiée à l'emplacement spécifié. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, int, int, int, int, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | Dessine la région spécifiée de l'image spécifiée dans le rectangle spécifié. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, float, float, float, float, GraphicsUnit, const Imaging::ImageAttributesPtr\&) | Dessine la région spécifiée de l'image spécifiée dans le rectangle spécifié. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, int, int, int, int, GraphicsUnit) | Dessine la région spécifiée de l'image spécifiée dans le rectangle spécifié. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, float, float, float, float, GraphicsUnit) | Dessine la région spécifiée de l'image spécifiée dans le rectangle spécifié. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, int, int, int, int, GraphicsUnit, const Imaging::ImageAttributesPtr\&, Graphics::DrawImageAbort) | NON IMPLEMENTÉ. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, float, float, float, float, GraphicsUnit, const Imaging::ImageAttributesPtr\&, Graphics::DrawImageAbort) | NON IMPLEMENTÉ. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, int, int, int, int, GraphicsUnit, const Imaging::ImageAttributesPtr\&, Graphics::DrawImageAbort, IntPtr) | NON IMPLEMENTÉ. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, Rectangle, float, float, float, float, GraphicsUnit, const Imaging::ImageAttributesPtr\&, Graphics::DrawImageAbort, IntPtr) | NON IMPLEMENTÉ. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const ArrayPtr\<PointF\>\&, RectangleF, GraphicsUnit) | NON IMPLEMENTÉ. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const ArrayPtr\<PointF\>\&) | NON IMPLEMENTÉ. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const ArrayPtr\<Point\>\&, Rectangle, GraphicsUnit) | NON IMPLEMENTÉ. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, const ArrayPtr\<Point\>\&, Rectangle, GraphicsUnit, const SharedPtr\<Imaging::ImageAttributes\>\&) | Dessine la région spécifiée de l'image spécifiée à l'emplacement spécifié. |
| [DrawImage](./drawimage/)(const SharedPtr\<Image\>\&, float, float, RectangleF, GraphicsUnit) | Dessine la région spécifiée de l'image spécifiée à l'emplacement spécifié. |
| [DrawImageUnscaled](./drawimageunscaled/)(const SharedPtr\<Image\>\&, int, int) | Dessine l'image spécifiée en utilisant sa taille physique d'origine à l'emplacement spécifié. |
| [DrawImageUnscaled](./drawimageunscaled/)(const SharedPtr\<Image\>\&, int, int, int, int) | Dessine une image spécifiée en utilisant sa taille physique d'origine à un emplacement spécifié. |
| [DrawImageUnscaled](./drawimageunscaled/)(const SharedPtr\<Image\>\&, const Rectangle\&) | Dessine une image spécifiée en utilisant sa taille physique d'origine à un emplacement spécifié. |
| [DrawImageUnscaled](./drawimageunscaled/)(const SharedPtr\<Image\>\&, const Point\&) | Dessine une image spécifiée en utilisant sa taille physique d'origine à un emplacement spécifié. |
| [DrawImageUnscaledAndClipped](./drawimageunscaledandclipped/)(const SharedPtr\<Image\>\&, Rectangle) | NON IMPLEMENTÉ. |
| [DrawLine](./drawline/)(const SharedPtr\<Pen\>\&, Point, Point) | Dessine la ligne spécifiée en utilisant le stylo spécifié. |
| [DrawLine](./drawline/)(const SharedPtr\<Pen\>\&, PointF, PointF) | Dessine la ligne spécifiée en utilisant le stylo spécifié. |
| [DrawLine](./drawline/)(const SharedPtr\<Pen\>\&, int, int, int, int) | Dessine la ligne spécifiée en utilisant le stylo spécifié. |
| [DrawLine](./drawline/)(const SharedPtr\<Pen\>\&, float, float, float, float) | Dessine la ligne spécifiée en utilisant le stylo spécifié. |
| [DrawLines](./drawlines/)(const SharedPtr\<Pen\>\&, const System::ArrayPtr\<System::Drawing::Point\>\&) | Dessine une série de segments de ligne en utilisant le stylo spécifié. |
| [DrawLines](./drawlines/)(const SharedPtr\<Pen\>\&, const System::ArrayPtr\<System::Drawing::PointF\>\&) | Dessine une série de segments de ligne en utilisant le stylo spécifié. |
| [DrawPath](./drawpath/)(const SharedPtr\<Pen\>\&, const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Dessine le chemin spécifié en utilisant le stylo spécifié. |
| [DrawPie](./drawpie/)(const SharedPtr\<Pen\>\&, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t) | Dessine le secteur spécifié en utilisant le stylo spécifié sur la surface représentée par l'objet actuel. |
| [DrawPie](./drawpie/)(const SharedPtr\<Pen\>\&, float, float, float, float, float, float) | Dessine le secteur spécifié en utilisant le stylo spécifié sur la surface représentée par l'objet actuel. |
| [DrawPie](./drawpie/)(const SharedPtr\<Pen\>\&, Rectangle, float, float) | Dessine le secteur spécifié en utilisant le stylo spécifié sur la surface représentée par l'objet actuel. |
| [DrawPie](./drawpie/)(const SharedPtr\<Pen\>\&, RectangleF, float, float) | Dessine le secteur spécifié en utilisant le stylo spécifié sur la surface représentée par l'objet actuel. |
| [DrawPolygon](./drawpolygon/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&) | Dessine un polygone en utilisant le stylo spécifié. |
| [DrawPolygon](./drawpolygon/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&) | Dessine un polygone en utilisant le stylo spécifié. |
| [DrawRectangle](./drawrectangle/)(const SharedPtr\<Pen\>\&, int, int, int, int) | Dessine le rectangle spécifié en utilisant le stylo spécifié sur la surface représentée par l'objet actuel. |
| [DrawRectangle](./drawrectangle/)(const SharedPtr\<Pen\>\&, float, float, float, float) | Dessine le rectangle spécifié en utilisant le stylo spécifié sur la surface représentée par l'objet actuel. |
| [DrawRectangle](./drawrectangle/)(const SharedPtr\<Pen\>\&, Rectangle) | Dessine le rectangle spécifié en utilisant le stylo spécifié sur la surface représentée par l'objet actuel. |
| [DrawRectangles](./drawrectangles/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<Rectangle\>\&) | Dessine une série de rectangles en utilisant le stylo spécifié. |
| [DrawRectangles](./drawrectangles/)(const SharedPtr\<Pen\>\&, const ArrayPtr\<RectangleF\>\&) | Dessine une série de rectangles en utilisant le stylo spécifié. |
| [DrawString](./drawstring/)(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, PointF, const System::SharedPtr\<System::Drawing::StringFormat\>\&) | Dessine la chaîne spécifiée à l'emplacement spécifié en utilisant la police et le pinceau spécifiés. |
| [DrawString](./drawstring/)(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, RectangleF, const System::SharedPtr\<System::Drawing::StringFormat\>\&) | Dessine la chaîne spécifiée dans le rectangle spécifié en utilisant la police et le pinceau spécifiés. |
| [DrawString](./drawstring/)(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, float, float, const System::SharedPtr\<System::Drawing::StringFormat\>\&) | Dessine la chaîne spécifiée à l'emplacement spécifié en utilisant la police et le pinceau spécifiés. |
| [EndContainer](./endcontainer/)(const SharedPtr\<Drawing2D::GraphicsContainer\>\&) | Ferme le conteneur actuel et restaure l'état de cet objet à partir de l'état du conteneur enregistré. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, const ArrayPtr\<PointF\>\&, Graphics::EnumerateMetafileProc) | NON IMPLEMENTÉ. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, const ArrayPtr\<Point\>\&, Graphics::EnumerateMetafileProc) | NON IMPLEMENTÉ. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, Point, Graphics::EnumerateMetafileProc) | NON IMPLEMENTÉ. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, PointF, Graphics::EnumerateMetafileProc) | NON IMPLEMENTÉ. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, Rectangle, Graphics::EnumerateMetafileProc) | NON IMPLEMENTÉ. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, RectangleF, Graphics::EnumerateMetafileProc) | NON IMPLEMENTÉ. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, Point, Rectangle, GraphicsUnit, Graphics::EnumerateMetafileProc) | NON IMPLEMENTÉ. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, PointF, RectangleF, GraphicsUnit, Graphics::EnumerateMetafileProc) | NON IMPLEMENTÉ. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, const ArrayPtr\<Point\>\&, Rectangle, GraphicsUnit, Graphics::EnumerateMetafileProc) | NON IMPLEMENTÉ. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, const ArrayPtr\<PointF\>\&, RectangleF, GraphicsUnit, Graphics::EnumerateMetafileProc) | NON IMPLEMENTÉ. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, Rectangle, Rectangle, GraphicsUnit, Graphics::EnumerateMetafileProc) | NON IMPLEMENTÉ. |
| [EnumerateMetafile](./enumeratemetafile/)(const SharedPtr\<Imaging::Metafile\>\&, RectangleF, RectangleF, GraphicsUnit, Graphics::EnumerateMetafileProc) | NON IMPLEMENTÉ. |
| [ExcludeClip](./excludeclip/)(Rectangle) | NON IMPLEMENTÉ. |
| [ExcludeClip](./excludeclip/)(const SharedPtr\<Region\>\&) | NON IMPLEMENTÉ. |
| [FillClosedCurve](./fillclosedcurve/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<PointF\>\&, Drawing2D::FillMode, float) | Dessine une spline fermée en utilisant le pinceau spécifié. |
| [FillClosedCurve](./fillclosedcurve/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<Point\>\&, Drawing2D::FillMode, float) | Dessine une spline fermée en utilisant le pinceau spécifié. |
| [FillEllipse](./fillellipse/)(const SharedPtr\<Brush\>\&, Rectangle) | Remplit l'intérieur de l'ellipse spécifiée par le rectangle englobant en utilisant le pinceau spécifié. |
| [FillEllipse](./fillellipse/)(const SharedPtr\<Brush\>\&, RectangleF) | Remplit l'intérieur de l'ellipse spécifiée par le rectangle englobant en utilisant le pinceau spécifié. |
| [FillEllipse](./fillellipse/)(const SharedPtr\<Brush\>\&, int, int, int, int) | Remplit l'intérieur de l'ellipse spécifiée par le rectangle englobant en utilisant le pinceau spécifié. |
| [FillEllipse](./fillellipse/)(const SharedPtr\<Brush\>\&, float, float, float, float) | Remplit l'intérieur de l'ellipse spécifiée par le rectangle englobant en utilisant le pinceau spécifié. |
| [FillPath](./fillpath/)(const SharedPtr\<Brush\>\&, const SharedPtr\<Drawing2D::GraphicsPath\>\&) | Remplit les intérieurs du chemin spécifié en utilisant le pinceau spécifié. |
| [FillPie](./fillpie/)(const SharedPtr\<Brush\>\&, int, int, int, int, int, int) | Remplit le secteur spécifié en utilisant le pinceau spécifié sur la surface représentée par l'objet actuel. |
| [FillPie](./fillpie/)(const SharedPtr\<Brush\>\&, float, float, float, float, float, float) | Remplit le secteur spécifié en utilisant le pinceau spécifié sur la surface représentée par l'objet actuel. |
| [FillPie](./fillpie/)(const SharedPtr\<Brush\>\&, Rectangle, float, float) | Remplit le secteur spécifié en utilisant le pinceau spécifié sur la surface représentée par l'objet actuel. |
| [FillPolygon](./fillpolygon/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<Point\>\&, Drawing2D::FillMode) | Remplit les intérieurs du polygone spécifié en utilisant le pinceau spécifié. |
| [FillPolygon](./fillpolygon/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<PointF\>\&, Drawing2D::FillMode) | Remplit les intérieurs du polygone spécifié en utilisant le pinceau spécifié. |
| [FillRectangle](./fillrectangle/)(const SharedPtr\<Brush\>\&, float, float, float, float) | Remplit le rectangle spécifié avec le pinceau spécifié. |
| [FillRectangle](./fillrectangle/)(const SharedPtr\<Brush\>\&, int, int, int, int) | Remplit le rectangle spécifié avec le pinceau spécifié. |
| [FillRectangle](./fillrectangle/)(const SharedPtr\<Brush\>\&, Rectangle) | Remplit le rectangle spécifié avec le pinceau spécifié. |
| [FillRectangle](./fillrectangle/)(const SharedPtr\<Brush\>\&, RectangleF) | Remplit le rectangle spécifié avec le pinceau spécifié. |
| [FillRectangles](./fillrectangles/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<Rectangle\>\&) | Remplit une série de rectangles en utilisant le pinceau spécifié. |
| [FillRectangles](./fillrectangles/)(const SharedPtr\<Brush\>\&, const ArrayPtr\<RectangleF\>\&) | Remplit une série de rectangles en utilisant le pinceau spécifié. |
| [FillRegion](./fillregion/)(const SharedPtr\<Brush\>\&, const SharedPtr\<Region\>\&) | Remplit les intérieurs de la région spécifiée en utilisant le pinceau spécifié. |
| [Flush](./flush/)(Drawing2D::FlushIntention) | Déclenche l'exécution immédiate de toutes les opérations de dessin en attente. |
| static [FromHwnd](./fromhwnd/)(IntPtr) | NON IMPLEMENTÉ. |
| static [FromHwndInternal](./fromhwndinternal/)(IntPtr) | NON IMPLEMENTÉ. |
| static [FromImage](./fromimage/)(const SharedPtr\<Image\>\&) | Crée un nouvel objet [Graphics](./) à partir de l'image spécifiée. |
| [get_Clip](./get_clip/)() | Renvoie un objet [Region](../region/) qui représente une région limitant la zone de dessin de la surface de dessin représentée par l'objet [Graphics](./) actuel. |
| [get_ClipBounds](./get_clipbounds/)() const | Renvoie un rectangle qui délimite la zone de rognage de la surface représentée par l'objet actuel. |
| [get_CompositingMode](./get_compositingmode/)() | Renvoie une valeur indiquant comment les images composites sont dessinées sur la surface représentée par l'objet actuel. |
| [get_CompositingQuality](./get_compositingquality/)() | Renvoie une valeur indiquant le niveau de qualité utilisé lors du compositing d'images. |
| [get_DpiX](./get_dpix/)() | Renvoie la résolution horizontale. |
| [get_DpiY](./get_dpiy/)() | Renvoie la résolution verticale. |
| [get_InterpolationMode](./get_interpolationmode/)() | Renvoie une valeur indiquant le mode d'interpolation associé à l'objet actuel. |
| [get_IsClipEmpty](./get_isclipempty/)() const | NON IMPLEMENTÉ. |
| [get_IsVisibleClipEmpty](./get_isvisibleclipempty/)() const | NON IMPLEMENTÉ. |
| [get_PageScale](./get_pagescale/)() const | Renvoie l'échelle entre les unités du monde et les unités de page pour l'objet [Graphics](./) actuel. |
| [get_PageUnit](./get_pageunit/)() const | Renvoie les unités de mesure utilisées pour les coordonnées de page sur la surface représentée par l'objet actuel. |
| [get_PixelOffsetMode](./get_pixeloffsetmode/)() | Renvoie une valeur indiquant comment les pixels sont décalés lors du rendu sur la surface représentée par l'objet actuel. |
| [get_RenderingOrigin](./get_renderingorigin/)() const | Renvoie un objet [Point](../point/) qui représente l'origine du rendu de l'objet [Graphics](./) actuel pour le dithering et les pinceaux à hachures. |
| [get_SmoothingMode](./get_smoothingmode/)() | Renvoie une valeur indiquant un mode apaisant utilisé lors du rendu sur la surface représentée par l'objet actuel. |
| [get_TextContrast](./get_textcontrast/)() const | NON IMPLEMENTÉ. |
| [get_TextRenderingHint](./get_textrenderinghint/)() | Renvoie une valeur indiquant la qualité du rendu du texte. |
| [get_Transform](./get_transform/)() | Renvoie la transformation géométrique du monde pour l'objet [Graphics](./) actuel. |
| [get_VisibleClipBounds](./get_visibleclipbounds/)() const | Renvoie l'objet [RectangleF](../rectanglef/) qui représente un rectangle englobant de la région de rognage visible de l'objet [Graphics](./) actuel. |
| [GetHdc](./gethdc/)() | NON IMPLEMENTÉ. |
| [GetNearestColor](./getnearestcolor/)(Color) | NON IMPLEMENTÉ. |
| [GetSkCanvas](./getskcanvas/)() const |  |
| [IntersectClip](./intersectclip/)(const System::SharedPtr\<Region\>\&) | Met à jour la région de rognage de cet objet à l'intersection du rognage actuel et du rognage spécifié. |
| [IntersectClip](./intersectclip/)(System::Drawing::RectangleF) | Met à jour la région de rognage de cet objet à l'intersection du rognage actuel et du rognage spécifié. |
| [IntersectClip](./intersectclip/)(System::Drawing::Rectangle) | Met à jour la région de rognage de cet objet à l'intersection du rognage actuel et du rognage spécifié. |
| [IsVisible](./isvisible/)(Point) | Détermine si le point spécifié est contenu dans la région de rognage visible de l'objet [Graphics](./) actuel. |
| [IsVisible](./isvisible/)(PointF) | NON IMPLEMENTÉ. |
| [IsVisible](./isvisible/)(Rectangle) | NON IMPLEMENTÉ. |
| [IsVisible](./isvisible/)(RectangleF) | NON IMPLEMENTÉ. |
| [IsVisible](./isvisible/)(int32_t, int32_t) | NON IMPLEMENTÉ. |
| [IsVisible](./isvisible/)(float, float) | NON IMPLEMENTÉ. |
| [IsVisible](./isvisible/)(float, float, float, float) | NON IMPLEMENTÉ. |
| [IsVisible](./isvisible/)(int32_t, int32_t, int32_t, int32_t) | NON IMPLEMENTÉ. |
| [MeasureCharacterRanges](./measurecharacterranges/)(const System::String\&, const SharedPtr\<Font\>\&, RectangleF, const SharedPtr\<StringFormat\>\&) | Renvoie un tableau de régions, chacune délimitant les positions de caractères dans la chaîne spécifiée. |
| [MeasureString](./measurestring/)(String const\&, System::SharedPtr\<Font\> const\&, PointF const\&, System::SharedPtr\<StringFormat\> const\&) const | Renvoie la taille de la chaîne spécifiée lorsqu'elle est dessinée avec la police spécifiée dans le format spécifié. |
| [MeasureString](./measurestring/)(String const\&, System::SharedPtr\<Font\> const\&, int, System::SharedPtr\<StringFormat\> const\&) const | Renvoie la taille de la chaîne spécifiée lorsqu'elle est dessinée avec la police spécifiée dans le format spécifié. |
| [MeasureString](./measurestring/)(String const\&, System::SharedPtr\<Font\> const\&, SizeF const\&, System::SharedPtr\<StringFormat\> const\&, int\&, int\&) const | NON IMPLEMENTÉ. |
| [MeasureString](./measurestring/)(String const\&, System::SharedPtr\<Font\> const\&, SizeF const\&, System::SharedPtr\<StringFormat\> const\&) const | Renvoie la taille de la chaîne spécifiée lorsqu'elle est dessinée avec la police spécifiée dans le format spécifié. |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Drawing2D::Matrix\>\&, Drawing2D::MatrixOrder) | Multiplie la matrice de transformation du monde de l'objet [Graphics](./) actuel par la matrice spécifiée. |
| [ReleaseHdc](./releasehdc/)() | NON IMPLEMENTÉ. |
| [ReleaseHdc](./releasehdc/)(IntPtr) | NON IMPLEMENTÉ. |
| [ResetClip](./resetclip/)() | Réinitialise la région de découpage de ce graphique à une région infinie. |
| [ResetTransform](./resettransform/)() | Réinitialise la matrice de transformation du monde de l'objet actuel afin qu'elle devienne une matrice identité. |
| [Restore](./restore/)(const SharedPtr\<Drawing2D::GraphicsState\>\&) | Restaure l'état de cet objet à partir de l'état sauvegardé. |
| [RotateTransform](./rotatetransform/)(float, Drawing2D::MatrixOrder) | Applique la rotation spécifiée à la matrice de transformation du monde de l'objet [Graphics](./) actuel dans l'ordre spécifié. |
| [Save](./save/)() | Enregistre l'état actuel de cet objet et renvoie l'état sauvegardé. |
| [ScaleTransform](./scaletransform/)(float, float, Drawing2D::MatrixOrder) | Applique le vecteur d'échelle spécifié à la matrice de transformation du monde de l'objet actuel. |
| [set_Clip](./set_clip/)(const SharedPtr\<Region\>\&) | Définit une région qui limite la zone de dessin de la surface de dessin représentée par l'objet actuel. |
| [set_CompositingMode](./set_compositingmode/)(Drawing2D::CompositingMode) | Définit une valeur qui indique comment les images composites sont dessinées sur la surface représentée par l'objet actuel. |
| [set_CompositingQuality](./set_compositingquality/)(Drawing2D::CompositingQuality) | Définit une valeur qui spécifie le niveau de qualité à utiliser lors du compositing d'images. |
| [set_InterpolationMode](./set_interpolationmode/)(Drawing2D::InterpolationMode) | Définit une valeur qui indique le mode d'interpolation associé à l'objet actuel. |
| [set_PageScale](./set_pagescale/)(float) | Définit l'échelle entre les unités du monde et les unités de page pour l'objet [Graphics](./) actuel. |
| [set_PageUnit](./set_pageunit/)(GraphicsUnit) | Définit les unités de mesure utilisées pour les coordonnées de page sur la surface représentée par l'objet actuel. |
| [set_PixelOffsetMode](./set_pixeloffsetmode/)(Drawing2D::PixelOffsetMode) | Définit une valeur qui spécifie comment les pixels doivent être décalés lors du rendu sur la surface représentée par l'objet actuel. |
| [set_RenderingOrigin](./set_renderingorigin/)(Point) | Définit un objet [Point](../point/) qui spécifie l'origine du rendu de l'objet [Graphics](./) actuel pour le tramage et les pinceaux à hachures. |
| [set_SmoothingMode](./set_smoothingmode/)(Drawing2D::SmoothingMode) | Définit une valeur qui spécifie un mode apaisant utilisé lors du rendu sur la surface représentée par l'objet actuel. |
| [set_TextContrast](./set_textcontrast/)(int32_t) | NON IMPLEMENTÉ. |
| [set_TextRenderingHint](./set_textrenderinghint/)(Text::TextRenderingHint) | Définit une valeur qui spécifie la qualité du rendu du texte. |
| [set_Transform](./set_transform/)(const SharedPtr\<Drawing2D::Matrix\>\&) | Définit la transformation géométrique du monde pour l'objet [Graphics](./) actuel. |
| [SetClip](./setclip/)(const SharedPtr\<Region\>\&, Drawing2D::CombineMode) | Définit la région de découpage de la surface de dessin représentée par l'objet [Graphics](./) actuel au résultat de l'opération spécifiée qui combine la région de découpage actuelle et la région spécifiée. |
| [SetClip](./setclip/)(Rectangle, Drawing2D::CombineMode) | Définit la région de découpage de la surface de dessin représentée par l'objet [Graphics](./) actuel au résultat de l'opération spécifiée qui combine la région de découpage actuelle et la région spécifiée. |
| [SetClip](./setclip/)(RectangleF, Drawing2D::CombineMode) | Définit la région de découpage de la surface de dessin représentée par l'objet [Graphics](./) actuel au résultat de l'opération spécifiée qui combine la région de découpage actuelle et la région spécifiée. |
| [SetClip](./setclip/)(const SharedPtr\<Graphics\>\&, Drawing2D::CombineMode) | NON IMPLEMENTÉ. |
| [SetClip](./setclip/)(const SharedPtr\<Drawing2D::GraphicsPath\>\&, Drawing2D::CombineMode) | Définit la région de découpage de la surface de dessin représentée par l'objet [Graphics](./) actuel au résultat de l'opération spécifiée qui combine la région de découpage actuelle et la région spécifiée par un chemin graphique. |
| [TransformPoints](./transformpoints/)(Drawing2D::CoordinateSpace, Drawing2D::CoordinateSpace, const ArrayPtr\<System::Drawing::Point\>\&) | NON IMPLEMENTÉ. |
| [TransformPoints](./transformpoints/)(Drawing2D::CoordinateSpace, Drawing2D::CoordinateSpace, const ArrayPtr\<System::Drawing::PointF\>\&) | NON IMPLEMENTÉ. |
| [TranslateClip](./translateclip/)(int, int) | NON IMPLEMENTÉ. |
| [TranslateClip](./translateclip/)(float, float) | NON IMPLEMENTÉ. |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | Applique le vecteur de translation spécifié à la matrice de transformation du monde de l'objet [Graphics](./) actuel. |
| [~Graphics](./~graphics/)() |  |
## Typedefs

| Typedef | Description |
| --- | --- |
| [DrawImageAbort](./drawimageabort/) | Le type d'un objet fonction de rappel utilisé comme argument pour la méthode DrawImage. |
| [EnumerateMetafileProc](./enumeratemetafileproc/) | Le type d'un objet fonction de rappel utilisé comme argument pour la méthode EnumerateMetafile. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
