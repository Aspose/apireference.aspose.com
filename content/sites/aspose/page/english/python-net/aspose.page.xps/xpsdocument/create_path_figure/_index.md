---
title: create_path_figure method
second_title: Aspose.Page for Python via .NET API References
description: 
type: docs
weight: 200
url: /python-net/aspose.page.xps/xpsdocument/create_path_figure/
is_root: false
---

## create_path_figure {#aspose.pydrawing.PointF-bool}

Creates a new path figure.


### Returns 


New path figure.


```python
def create_path_figure(self, start_point, is_closed):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| start_point | aspose.pydrawing.PointF | The starting point for the first segment of the path figure. |
| is_closed | bool | Specifies whether the path is closed. If set to true, the stroke is drawn<br/>"closed", that is, the last point in the last segment of the path figure is connected with<br/>the point specified in the StartPoint attribute, otherwise the stroke is drawn "open", and<br/>the last point is not connected to the start point. Only applicable if the path figure is<br/>used in a Path element that specifies a stroke. |


## create_path_figure {#aspose.pydrawing.PointF-System.Collections.Generic.List<Aspose.Page.XPS.XpsModel.XpsPathSegment>-bool}





```python
def create_path_figure(self, start_point, segments, is_closed):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| start_point | aspose.pydrawing.PointF |  |
| segments | System.Collections.Generic.List<Aspose.Page.XPS.XpsModel.XpsPathSegment> |  |
| is_closed | bool |  |



### See Also
* module [`aspose.page.xps`](../../)
* class [`XpsDocument`](/page/python-net/aspose.page.xps/xpsdocument)
* class [`XpsPathFigure`](/page/python-net/aspose.page.xps.xpsmodel/xpspathfigure)
