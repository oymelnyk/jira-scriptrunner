import com.atlassian.jira.component.ComponentAccessor 
import com.onresolve.jira.groovy.user.FieldBehaviours 
import groovy.transform.BaseScript 

@BaseScript FieldBehaviours fieldBehaviours 

if (underlyingIssue) {
    return 
}

def cf10200 = getFieldById('customfield_10200')

def getOptionById = ComponentAccessor.getOptionsManager().getAllOptions().findAll{cf10200}
getOptionById = getOptionById[0,1,2,3].join(',')
cf10200.setFormValue(getOptionById)
