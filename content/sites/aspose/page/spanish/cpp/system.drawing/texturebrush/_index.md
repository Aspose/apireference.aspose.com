---
title: "Clase System::Drawing::TextureBrush"
linktitle: "TextureBrush"
second_title: "Aspose.Page para C++"
description: "Clase System::Drawing::TextureBrush. Representa una brocha que utiliza una imagen para rellenar el interior de una forma. Los objetos de esta clase solo deben ser asignados usando la función System::MakeObject(). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallos de aserción. Siempre envuelva esta clase en un puntero System::SmartPtr y use ese puntero para pasarlo a funciones como argumento en C++."
type: docs
weight: 2800
url: /es/cpp/system.drawing/texturebrush/
---
## TextureBrush class


Representa una brocha que utiliza una imagen para rellenar el interior de una forma. Los objetos de esta clase solo deben ser asignados usando la función [System::MakeObject()](../../system/makeobject/). Nunca cree una instancia de este tipo en la pila ni usando el operador new, ya que provocará errores en tiempo de ejecución y/o fallos de aserción. Siempre envuelva esta clase en un puntero [System::SmartPtr](../../system/smartptr/) y use ese puntero para pasarlo a funciones como argumento.

```cpp
class TextureBrush : public System::Drawing::Brush
```

## Métodos

| Método | Descripción |
| --- | --- |
| [Clone](./clone/)() override | Crea una copia del objeto actual. |
| [get_Image](./get_image/)() | Devuelve una imagen utilizada por el objeto [TextureBrush](./) actual. |
| [get_Transform](./get_transform/)() | Devuelve una copia de un objeto Matrix que especifica las transformaciones geométricas para la brocha representada por el objeto actual. |
| [get_WrapMode](./get_wrapmode/)() | Devuelve un valor que especifica cómo se repite la brocha representada por el objeto actual. |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Drawing2D::Matrix\>\&, Drawing2D::MatrixOrder) | Multiplica la matriz de transformación del objeto actual por la matriz especificada. |
| [ResetTransform](./resettransform/)() | Restablece la matriz de transformación del objeto actual para que se convierta en una matriz identidad. |
| [RotateTransform](./rotatetransform/)(float, Drawing2D::MatrixOrder) | Rota la transformación geométrica local por el ángulo especificado en el orden especificado. |
| [ScaleTransform](./scaletransform/)(float, float, Drawing2D::MatrixOrder) | Escala la transformación geométrica local por los factores especificados en el orden especificado. |
| [set_Transform](./set_transform/)(const System::SharedPtr\<Drawing2D::Matrix\>\&) | Establece un objeto Matrix que especifica las transformaciones geométricas para la brocha representada por el objeto actual. |
| [set_WrapMode](./set_wrapmode/)(Drawing2D::WrapMode) | Establece un valor que especifica cómo se repite la brocha representada por el objeto actual. |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, Drawing2D::WrapMode) | Construye una nueva instancia de la clase [TextureBrush](./) que utiliza la imagen especificada. |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, RectangleF, const SharedPtr\<Imaging::ImageAttributes\>\&) | Construye una nueva instancia de la clase [TextureBrush](./) que utiliza la imagen especificada. |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, Rectangle, const SharedPtr\<Imaging::ImageAttributes\>\&) | Construye una nueva instancia de la clase [TextureBrush](./) que utiliza la imagen especificada. |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, Drawing2D::WrapMode, RectangleF) | Construye una nueva instancia de la clase [TextureBrush](./) que utiliza la imagen especificada. |
| [TextureBrush](./texturebrush/)(const SharedPtr\<Image\>\&, Drawing2D::WrapMode, Rectangle) | Construye una nueva instancia de la clase [TextureBrush](./) que utiliza la imagen especificada. |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | Traslada la transformación geométrica local por las dimensiones especificadas en el orden especificado. |
| virtual [~TextureBrush](./~texturebrush/)() | Destructor. |
## Ver también

* Class [Brush](../brush/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
