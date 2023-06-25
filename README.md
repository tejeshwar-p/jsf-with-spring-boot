## JSF 4 with Spring boot 3.1.1 example
### This example was created using joinfaces

Application runs but does not show any page.
However, if no faces tags are used application runs fine with only html tags.(which is completely useless btw)

I get the below info in logs which I suspect is the main problem for showing up blank page as none of the EL tags 
are resolved.

```j.e.resource.webcontainer.jsf.lifecycle  : JSF1027: [null] The ELResolvers for Faces were not registered with the Jakarta Server Pages container.```

Did not find any way to fix this. Need some help on it.


Abandoning this project due to time constraints and will take it up later once I find any fix or any better compatibility introduced by Spring and JSF community.