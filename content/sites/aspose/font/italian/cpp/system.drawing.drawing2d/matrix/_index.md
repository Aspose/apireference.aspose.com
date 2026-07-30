---
title: "System::Drawing::Drawing2D::Matrix classe"
linktitle: "Matrix"
second_title: "Aspose.Font per C++"
description: "System::Drawing::Drawing2D::Matrix classe. Rappresenta una matrice 3x3 che definisce le operazioni di trasformazione. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1000
url: /it/cpp/system.drawing.drawing2d/matrix/
---
## Matrix class


Rappresenta una matrice 3x3 che definisce le operazioni di trasformazione. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarlo alle funzioni come argomento.

```cpp
class Matrix : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Clone](./clone/)() const | Crea una copia dell'oggetto corrente. |
| [Dispose](./dispose/)() | Rilascia tutte le risorse del sistema operativo acquisite dall'oggetto corrente. |
| [Equals](./equals/)(ptr) override | Verifica se l'oggetto specificato è un [Matrix](./) ed è identico a questo oggetto. |
| [get_Elements](./get_elements/)() const | Restituisce un array contenente gli elementi della matrice nell'ordine seguente: m11, m12, m21, m22, dx, dy. |
| [get_IsIdentity](./get_isidentity/)() const | Determina se la matrice rappresentata dall'oggetto corrente è una matrice identità. |
| [get_IsInvertible](./get_isinvertible/)() const | Determina se la matrice rappresentata dall'oggetto corrente è invertibile. |
| [get_OffsetX](./get_offsetx/)() const | Restituisce il valore di traslazione X della matrice rappresentata dall'oggetto corrente. |
| [get_OffsetY](./get_offsety/)() const | Restituisce il valore di traslazione Y della matrice rappresentata dall'oggetto corrente. |
| [Invert](./invert/)() | Inverte la matrice rappresentata dall'oggetto corrente. |
| [Matrix](./matrix/)() | Crea una nuova istanza della classe [Matrix](./) che rappresenta una matrice identità. |
| [Matrix](./matrix/)(float, float, float, float, float, float) | Crea una nuova istanza della classe [Matrix](./) e la inizializza con i valori specificati. |
| [Matrix](./matrix/)(const Rectangle\&, const ArrayPtr\<Point\>\&) | Crea una nuova istanza della classe [Matrix](./) per la trasformazione geometrica definita dal rettangolo e dall'array di punti specificati. |
| [Matrix](./matrix/)(const RectangleF\&, const ArrayPtr\<PointF\>\&) | Crea una nuova istanza della classe [Matrix](./) per la trasformazione geometrica definita dal rettangolo e dall'array di punti specificati. |
| [Multiply](./multiply/)(const SharedPtr\<Matrix\>\&) | Moltiplica la matrice rappresentata dall'oggetto corrente per la matrice specificata. |
| [Multiply](./multiply/)(const SharedPtr\<Matrix\>\&, MatrixOrder) | Moltiplica la matrice rappresentata dall'oggetto corrente per la matrice specificata. |
| [Reset](./reset/)() | Reimposta la matrice rappresentata dall'oggetto corrente in modo che diventi una matrice identità. |
| [Rotate](./rotate/)(float) | Ruota la matrice rappresentata dall'oggetto corrente in senso orario dell'angolo specificato. |
| [Rotate](./rotate/)(float, MatrixOrder) | Ruota la matrice rappresentata dall'oggetto corrente in senso orario attorno all'origine dell'angolo specificato. |
| [RotateAt](./rotateat/)(float, const PointF\&) | Ruota la matrice rappresentata dall'oggetto corrente in senso orario attorno al punto specificato dell'angolo specificato. |
| [RotateAt](./rotateat/)(float, const PointF\&, MatrixOrder) | Ruota la matrice rappresentata dall'oggetto corrente in senso orario attorno al punto specificato dell'angolo specificato. |
| [Scale](./scale/)(float, float) | Applica il vettore di scala specificato alla matrice rappresentata dall'oggetto corrente. |
| [Scale](./scale/)(float, float, MatrixOrder) | Applica il vettore di scala specificato alla matrice rappresentata dall'oggetto corrente. |
| [Shear](./shear/)(float, float) | Applica il vettore di shear specificato alla matrice rappresentata dall'oggetto corrente. |
| [Shear](./shear/)(float, float, MatrixOrder) | Applica il vettore di shear specificato alla matrice rappresentata dall'oggetto corrente. |
| [TransformPoints](./transformpoints/)(const ArrayPtr\<Point\>\&) | Applica la trasformazione geometrica definita dalla matrice rappresentata dall'oggetto corrente ai punti specificati. |
| [TransformPoints](./transformpoints/)(const System::Details::ArrayView\<Point\>\&) | Applica la trasformazione geometrica definita dalla matrice rappresentata dall'oggetto corrente ai punti specificati. |
| [TransformPoints](./transformpoints/)(const ArrayPtr\<PointF\>\&) | Applica la trasformazione geometrica definita dalla matrice rappresentata dall'oggetto corrente ai punti specificati. |
| [TransformPoints](./transformpoints/)(const System::Details::ArrayView\<PointF\>\&) | Applica la trasformazione geometrica definita dalla matrice rappresentata dall'oggetto corrente ai punti specificati. |
| [TransformVectors](./transformvectors/)(const ArrayPtr\<Point\>\&) | Applica solo i componenti di scala e rotazione della matrice rappresentata dall'oggetto corrente ai punti specificati. |
| [TransformVectors](./transformvectors/)(const System::Details::ArrayView\<Point\>\&) | Applica solo i componenti di scala e rotazione della matrice rappresentata dall'oggetto corrente ai punti specificati. |
| [TransformVectors](./transformvectors/)(const ArrayPtr\<PointF\>\&) | Applica solo i componenti di scala e rotazione della matrice rappresentata dall'oggetto corrente ai punti specificati. |
| [TransformVectors](./transformvectors/)(const System::Details::ArrayView\<PointF\>\&) | Applica solo i componenti di scala e rotazione della matrice rappresentata dall'oggetto corrente ai punti specificati. |
| [Translate](./translate/)(float, float) | Applica il vettore di traslazione specificato alla matrice rappresentata dall'oggetto corrente. |
| [Translate](./translate/)(float, float, MatrixOrder) | Applica il vettore di traslazione specificato alla matrice rappresentata dall'oggetto corrente. |
| [VectorTransformPoints](./vectortransformpoints/)(const ArrayPtr\<Point\>\&) | Moltiplica ogni vettore in un array per la matrice rappresentata dall'oggetto corrente. |
| [VectorTransformPoints](./vectortransformpoints/)(const System::Details::ArrayView\<Point\>\&) | Moltiplica ogni vettore in un array per la matrice rappresentata dall'oggetto corrente. |
| virtual [~Matrix](./~matrix/)() | Distruttore. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Font for C++](../../)
