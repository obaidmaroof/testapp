package kpmg

class BootStrap {

    def init = { servletContext ->

        final Function deployment = new Function("deployment")
        final Function buildProcess = new Function("Build-Prozess")
        final Function versioning = new Function("Versionerung")
        final Function dataModel = new Function("Datenmodellierung")
        final Function softwareArchitecture = new Function("Softwarearchitektur")
        final Function codeDesign = new Function("Code Design")
        final Function interactionDesign = new Function("Interaction Design")

        final Domain devops = new Domain("Devops")
        devops.addToFunctions(deployment)
        devops.addToFunctions(buildProcess)
        devops.addToFunctions(versioning)

        final Domain design = new Domain("Design")
        design.addToFunctions(dataModel)
        design.addToFunctions(softwareArchitecture)
        design.addToFunctions(codeDesign)
        design.addToFunctions(interactionDesign)

        final Entity development = new Entity("Anwendingsentwicklng")
        development.addToDomains(devops)
        development.addToDomains(design)

        development.save()
    }
    def destroy = {
    }
}
